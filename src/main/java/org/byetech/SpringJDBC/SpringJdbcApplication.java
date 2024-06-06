package org.byetech.SpringJDBC;

import org.byetech.SpringJDBC.model.Alien;
import org.byetech.SpringJDBC.repository.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien = context.getBean(Alien.class);

		alien.setId(101);
		alien.setName("Suraj");
		alien.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);

		repo.save(alien);
		System.out.println(repo.findAll());

	}


}
