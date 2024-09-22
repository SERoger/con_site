package com.con_site.service.impl;

import com.con_site.entity.User;
import com.con_site.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService{
    @Autowired
    IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userRepository.findByUserName(username).get();
        if(user!=null) {
            UserDetails currentUser= org.springframework.security.core.userdetails.User.withUsername(username).password(user.getPassword()).roles(user.getRole().toString()).build();
            return currentUser;
        }
        throw new UsernameNotFoundException("Username not found");
    }

}
