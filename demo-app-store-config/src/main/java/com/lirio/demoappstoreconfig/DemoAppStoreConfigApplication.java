package com.lirio.demoappstoreconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude = ContextStackAutoConfiguration.class)
public class DemoAppStoreConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppStoreConfigApplication.class, args);
	}

}
