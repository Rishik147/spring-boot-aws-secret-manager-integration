package com.example.demo.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "custom.secrets")
@Getter
@Setter
public class SecretProperties {

    private String username;
    private String password;

}
