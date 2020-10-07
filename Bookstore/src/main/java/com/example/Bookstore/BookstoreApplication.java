package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;
import com.example.Bookstore.domain.User;
import com.example.Bookstore.domain.UserRepository;
//import com.example.Bookstore.domain.User;
//import com.example.Bookstore.domain.UserRepository;


@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);		
	}
	@Bean
	public CommandLineRunner bookDemo(CategoryRepository crepository, BookRepository brepository, UserRepository urepository) {
		return (args) -> {
			//log.info("save a couple of students");
			
			crepository.save(new Category("Kauhu"));
			crepository.save(new Category("Musiikki"));
			crepository.save(new Category("Scifi"));

			brepository.save(new Book("Kalevi", "Mäkelä", "Avaruus", "ISBN", "2015", crepository.findByName("Scifi").get(0)));
			brepository.save(new Book("Joonas", "Kallio", "Oodi", "962-234 533", "1999", crepository.findByName("Musiikki").get(0)));
			brepository.save(new Book("Mikko", "Mattila", "Java", "824-321 234", "2005", crepository.findByName("Kauhu").get(0)));
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			
			
		};
	}

}
