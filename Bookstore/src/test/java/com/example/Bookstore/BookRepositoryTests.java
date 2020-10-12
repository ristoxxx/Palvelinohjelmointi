package com.example.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
class BookRepositoryTests {

	    @Autowired
	    private BookRepository repository;

	    @Test
	    public void findByLastnameShouldReturnBook() {
	        List<Book> books = repository.findByLastName("Mattila");
	        
	        assertThat(books).hasSize(1);
	        assertThat(books.get(0).getFirstName()).isEqualTo("Mikko");
	    }
	   
	    @Test
	    public void createNewBook() {
	    	Book book1 = new Book("Mikko", "Mattila", "Java", "824-321 234", "2005", new Category("Kauhu"));
	    	Book book2 = new Book("Joonas", "Kallio", "Oodi", "962-234 533", "1999", new Category("Musiikki"));
	    	repository.save(book1);
	    	repository.save(book2);
	    	assertThat(book1.getId()).isNotNull();
	    	assertThat(book1.getCategory()).isNotNull();
	    }
	    
	    @Test
	    public void deleteBook() {
	    	List<Book> books = repository.findByYear("1999"); 
	    	Long id = books.get(0).getId();
	    	assertThat(books).hasSize(1);
	    	repository.deleteById(id);
	    	List<Book> newList = repository.findByYear("1999");
	    	assertThat(newList).hasSize(0);
	    }
	    
	    
	}
