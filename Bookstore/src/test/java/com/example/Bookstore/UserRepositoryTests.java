package com.example.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Bookstore.domain.User;
import com.example.Bookstore.domain.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest

class UserRepositoryTests {
	
    @Autowired
    private UserRepository repository;
    
    @Test
    public void createNewUser( ) {
    	User user = new User("heikki", "$2y$12$rsZm62HqAAdJ9xeMEspBguXDmlMjXaBCgBcs5wRxikzdcakS/lht6", "ADMIN");
		repository.save(user);
		assertThat(user.getRole()).isNotNull();
    }
    
    @Test
    public  void findUser() {
    	User user = new User("heikki", "$2y$12$rsZm62HqAAdJ9xeMEspBguXDmlMjXaBCgBcs5wRxikzdcakS/lht6", "ADMIN");
		repository.save(user);
    	User user1 = repository.findByUsername("heikki");
    	
    	assertThat(user1.getRole()).isEqualTo("ADMIN");
    	//assertThat(user1.getRole()).isNotNull();
		// TODO Auto-generated method stub
	}
    
    @Test
    public void deleteUser() {
    	User user = new User("heikki", "$2y$12$rsZm62HqAAdJ9xeMEspBguXDmlMjXaBCgBcs5wRxikzdcakS/lht6", "ADMIN");
		repository.save(user);
		User user1 = repository.findByUsername("heikki");
		Long id = user1.getId();
		repository.deleteById(id);
		User user2 = repository.findByUsername("heikki");
		assertThat(user2).isNull();
    }
    
    
}