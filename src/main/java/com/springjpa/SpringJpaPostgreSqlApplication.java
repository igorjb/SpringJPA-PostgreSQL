package com.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.repo.CustomerRepository;

@SpringBootApplication
public class SpringJpaPostgreSqlApplication {
	
	@Autowired
	CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}
	
	public void run(String...arg0) throws Exception {
		// clear all record if existed before do the tutorial with new data
		repository.deleteAll();
	}
}
