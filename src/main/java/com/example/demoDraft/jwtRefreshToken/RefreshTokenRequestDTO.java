package com.example.demoDraft.jwtRefreshToken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import com.example.demoDraft.jwtRefreshToken.RefreshTokenService;
import com.example.demoDraft.jwtRefreshToken.JwtService;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefreshTokenRequestDTO {
    private String token;
}
