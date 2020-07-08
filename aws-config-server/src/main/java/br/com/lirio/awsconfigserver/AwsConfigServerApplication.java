package br.com.lirio.awsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AwsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsConfigServerApplication.class, args);
	}

}
