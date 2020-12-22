package com.example.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class CoronaDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaDashboardApplication.class, args);
	}

}
