package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;


@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);		
	}
	@Bean
	public CommandLineRunner studentDemo(CategoryRepository crepository) {
		return (args) -> {
			//log.info("save a couple of students");
			crepository.save(new Category("Scifi"));
			crepository.save(new Category("Kauhu"));
			crepository.save(new Category("Musiikki"));

		};
	}

}
