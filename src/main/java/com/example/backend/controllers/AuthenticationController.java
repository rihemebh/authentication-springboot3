package com.example.backend.controllers;

import com.example.backend.data.dtos.AuthenticationRequest;
import com.example.backend.data.dtos.AuthenticationResponse;
import com.example.backend.data.dtos.RegisterRequest;
import com.example.backend.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

        @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.login(request));
    }
}
