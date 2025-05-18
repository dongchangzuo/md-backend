package com.example.mdbackend.payload.response;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
    private Date expiresAt;

    public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles, Date expiresAt) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.expiresAt = expiresAt;
    }
} 