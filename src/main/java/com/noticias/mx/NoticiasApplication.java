package com.noticias.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class NoticiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticiasApplication.class, args);
	}

}
