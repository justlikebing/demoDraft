package com.example.demoDraft.jwtRefreshToken;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import com.example.demoDraft.jwtRefreshToken.RefreshTokenService;
import com.example.demoDraft.jwtRefreshToken.JwtService;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthRequestDTO {
    private String username;
    private String password;
}