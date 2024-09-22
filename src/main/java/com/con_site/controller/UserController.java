package com.con_site.controller;

import com.con_site.dto.SigninRequest;
import com.con_site.dto.SignupRequest;
import com.con_site.exception.UserNotFoundException;
import com.con_site.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/account")
    public ResponseEntity<String> create(@RequestBody SignupRequest sr, BindingResult bindingResult) throws IllegalArgumentException{
        return new ResponseEntity<>(userService.create(sr,bindingResult),HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody SigninRequest signinRequest) throws UserNotFoundException {
        return new ResponseEntity<>(userService.login(signinRequest),HttpStatus.OK);
    }
}
