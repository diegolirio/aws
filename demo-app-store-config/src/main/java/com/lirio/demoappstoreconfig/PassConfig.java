package com.lirio.demoappstoreconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PassConfig {

    @Value("${customer.pass}")
    private String pass;

    @Bean("pass")
    public String getPass() {
        return this.pass;
    }

}
