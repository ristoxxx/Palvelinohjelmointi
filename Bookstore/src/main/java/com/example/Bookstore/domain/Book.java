package com.example.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.Bookstore.domain.Category;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
    private String lastName;
    private String title;
    private String isbn;
    private String year;
    
    public Book() {}

	public Book(String firstName, String lastName, String title, String isbn, String year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.isbn = isbn;
		this.year = year;
	}

	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", isbn" + isbn + ", year" + year +  "]";
	}
}