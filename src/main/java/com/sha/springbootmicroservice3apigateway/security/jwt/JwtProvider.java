package com.sha.springbootmicroservice3apigateway.security.jwt;

import com.sha.springbootmicroservice3apigateway.security.UserPrinciple;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrinciple auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
