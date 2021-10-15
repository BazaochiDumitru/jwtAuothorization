package com.example.jwtAuothorization.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;

}
