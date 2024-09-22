package com.con_site.service.impl;

import com.con_site.dto.SigninRequest;
import com.con_site.dto.SignupRequest;
import com.con_site.entity.User;
import com.con_site.enums.EUserRole;
import com.con_site.exception.UserNotFoundException;
import com.con_site.repository.IUserRepository;
import com.con_site.service.IUserService;
import com.nimbusds.jose.jwk.source.ImmutableSecret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public class AppUserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserServiceImpl userServiceImpl;

    @Value("${security.jwt.issuer}")
    String issuer;

    @Value("${security.jwt.secret.key}")
    String secretKey;

    @Override
    public String create(SignupRequest signupRequest, BindingResult result) throws IllegalArgumentException {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        User u=User.builder()
                .idUser(UUID.randomUUID().toString())
                .names(signupRequest.getNames())
                .userName(signupRequest.getUserName())
                .password(encoder.encode(signupRequest.getPassword()))
                .phoneNo(signupRequest.getPhoneNo())
                .email(signupRequest.getEmail())
                .role(EUserRole.valueOf(signupRequest.getRole()))
                .build();
        userRepository.save(u);
        return "Account Created Successfully";
    }

    public Map<String, Object> login(SigninRequest signinRequest) throws UserNotFoundException {
        Optional<User> appUserOptional=userRepository.findByUserName(signinRequest.getUserName());
        if(appUserOptional.isPresent()) {
            try {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signinRequest.getUserName(),signinRequest.getPassword()));
                String jwtToken=createJwtToken(appUserOptional.get());
                Map<String, Object> response=new HashMap<String,Object>();
                response.put("token", jwtToken);
                response.put("user", appUserOptional.get());
                return response;
            }catch(Exception ex) {
                throw new UserNotFoundException("UserName or Password wrong!");
            }
        }
        throw new UserNotFoundException("User not found!");
    }


    private String createJwtToken(User user) {
        Instant now=Instant.now();
        JwtClaimsSet claimsSet=JwtClaimsSet.builder().issuer(issuer)
                .issuedAt(now).expiresAt(now.plusSeconds(24*3600))
                .subject(user.getUserName())
                .claim("role", user.getRole()).build();

        NimbusJwtEncoder encoder=new NimbusJwtEncoder(new ImmutableSecret<>(secretKey.getBytes()));
        JwtEncoderParameters params=JwtEncoderParameters.from(JwsHeader.with(MacAlgorithm.HS256).build(),claimsSet);
        return encoder.encode(params).getTokenValue();
    }


}
