package com.example.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
 
    private final EmployeeRepository repository;
 
    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }
 
    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Biden", 45, 1));
        this.repository.save(new Employee("Obama", 54, 2));
        this.repository.save(new Employee("Mac", 34, 3));
        this.repository.save(new Employee("Teste 4", 33, 4));
    }
}