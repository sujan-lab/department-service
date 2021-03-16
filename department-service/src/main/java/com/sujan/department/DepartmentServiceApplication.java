package com.sujan.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		//System.setProperty("server.port", "9001");
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}
}
