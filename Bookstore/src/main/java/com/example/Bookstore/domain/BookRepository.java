package com.example.Bookstore.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByLastName(String lastName);
    
    List<Book> findByYear(@Param("year") String year);
    
}


