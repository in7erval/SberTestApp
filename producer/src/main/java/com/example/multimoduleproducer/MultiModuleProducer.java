package com.example.multimoduleproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MultiModuleProducer {

	public static void main(String[] args) {
		SpringApplication.run(MultiModuleProducer.class, args);
	}

}
