package com.example.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;

@RunWith(SpringRunner.class)
@DataJpaTest

class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository repository;
    
    @Test
    public  void findCategory() {
    	Category category = new Category("K");	    	
    	repository.save(category);
    	
    	List<Category> categories = repository.findByName("K");
    	
    	assertThat(categories).hasSize(1);
    	assertThat(categories.get(0).getCategoryid()).isNotNull();
		// TODO Auto-generated method stub

	}
    
    @Test
    public void createNewCategory() {
    	Category category = new Category("K");	    	
    	repository.save(category);
    	assertThat(category.getCategoryid()).isNotNull();
    }
    
    public void deleteCategory() {
    	Category category1 = new Category("K");	    	
    	repository.save(category1);
    	Category category2 = new Category("P");	    	
    	repository.save(category2);
    	
    	List<Category> categories = repository.findByName("P");
    	assertThat(categories).hasSize(1);
    	Long id = categories.get(0).getCategoryid();
    	repository.deleteById(id);
    	List<Category> newList = repository.findByName("P");
    	assertThat(newList).hasSize(0);
		
	}

}
