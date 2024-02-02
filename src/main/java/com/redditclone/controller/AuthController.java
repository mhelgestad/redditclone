package com.redditclone.controller;

import com.redditclone.dto.LoginRequest;
import com.redditclone.dto.RefreshTokenRequest;
import com.redditclone.dto.RegisterRequest;
import com.redditclone.service.AuthService;
import com.redditclone.service.RefreshTokenService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;
//    private final RefreshTokenService refreshTokenService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
    }

//    @GetMapping("accountVerification/{token}")
//    public ResponseEntity<String> verifyAccount(@PathVariable String token) {
//        return null;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(LoginRequest loginRequest) {
//        return null;
//    }
//
//    @PostMapping("/refresh/token")
//    public ResponseEntity<String> refreshTokens(@RequestBody RefreshTokenRequest refreshTokenRequest) {
//        return null;
//    }
//
//    @PostMapping("/logout")
//    public ResponseEntity<String> logout(@RequestBody RefreshTokenRequest refreshTokenRequest) {
//        return null;
//    }
}
