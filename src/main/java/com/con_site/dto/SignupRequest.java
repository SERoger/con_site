package com.con_site.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
    private String names;
    private String email;
    private String userName;
    private String phoneNo;
    private String password;
    private String role;
}
