package com.example.demo.controller;

import com.example.demo.configs.SecretProperties;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
@AllArgsConstructor
public class Controller {

    private final SecretProperties secretProperties;

    @GetMapping("/secrets")
    public ResponseEntity<List<String>> getSecrets() {
        return ResponseEntity.ok(List.of(secretProperties.getUsername(), secretProperties.getPassword()));
    }

}
