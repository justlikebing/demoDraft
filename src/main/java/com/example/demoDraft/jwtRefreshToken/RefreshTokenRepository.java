package com.example.demoDraft.jwtRefreshToken;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.security.authentication.AuthenticationManager;
import com.example.demoDraft.jwtRefreshToken.RefreshTokenService;
import com.example.demoDraft.jwtRefreshToken.JwtService;


import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Integer> {
    Optional<RefreshToken> findByToken(String token);
}