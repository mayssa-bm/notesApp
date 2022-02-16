package com.notesapp.notebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NotebookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotebookServiceApplication.class, args);
	}

}
