package com.lirio.demoappstoreconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CustomerController {

    @Value("${customer.name}")
    private String name;

    @Value("${customer.age}")
    private String age;

    @Value("${customer.pass}")
    private String pass;

    @GetMapping
    public List<String> get() {
        return List.of(name, age, pass);
    }

}
