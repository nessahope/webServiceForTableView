package com.hope.webservicefortableview;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@Bean
	CommandLineRunner runner (SuperheroRepository sRepository) {
	return args -> {
		Arrays.asList("Superman,Batman,WonderWoman,Zatanna".split(","))
			.forEach(name -> {
				Superhero toSave = new Superhero();
				toSave.setName(name);
				sRepository.save(toSave);
			});
		};


	}
}
