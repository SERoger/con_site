package com.con_site.service;

import com.con_site.dto.SigninRequest;
import com.con_site.dto.SignupRequest;
import com.con_site.exception.UserNotFoundException;
import org.springframework.validation.BindingResult;

import java.util.Map;

public interface IUserService {
    public String create(SignupRequest signupRequest, BindingResult result) throws IllegalArgumentException;
    public Map<String, Object> login(SigninRequest signinRequest) throws UserNotFoundException;
}
