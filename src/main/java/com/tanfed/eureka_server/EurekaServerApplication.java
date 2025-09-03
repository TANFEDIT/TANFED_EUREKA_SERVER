package com.tanfed.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServerApplication {
	
	@GetMapping("/test")
	public String test() throws Exception {
		return "Service Deployed Successfully!";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
