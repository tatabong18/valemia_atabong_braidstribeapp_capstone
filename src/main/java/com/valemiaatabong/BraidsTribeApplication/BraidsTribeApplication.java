package com.valemiaatabong.BraidsTribeApplication;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BraidsTribeApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BraidsTribeApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> System.out.println("BraidsTribe application got started!!");
		}
	}



