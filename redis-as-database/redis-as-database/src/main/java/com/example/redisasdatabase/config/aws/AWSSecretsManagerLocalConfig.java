package com.example.redisasdatabase.config.aws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local")
@Configuration
public class AWSSecretsManagerLocalConfig {

    @Bean("awsSecretRedisAuth")
    public String getSecret() {
        return "";
    }
}