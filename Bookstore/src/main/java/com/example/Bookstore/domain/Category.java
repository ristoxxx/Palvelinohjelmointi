package com.example.Bookstore.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.Bookstore.domain.Book;




@Entity
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@ManyToOne
    //@JoinColumn(name = "bookid" )
	private ArrayList<Book> books;
    private Long categoryid;
    private String categoryname;

	public Category() {}
    
    public Category(String categoryname) {
    	this.categoryname = categoryname;
    }

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
}
