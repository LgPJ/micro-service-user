package com.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.microservice.commons.user.entity"})
@SpringBootApplication
public class MicroServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceUserApplication.class, args);
	}

}
