package com.book.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.book.store.repositories")
public class BookStoreLauncher {
    public static void main(String args[]){
        SpringApplication.run(BookStoreLauncher.class,args);
    }
}
