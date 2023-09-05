package com.assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages={
        "com.assignment2.demo.controller", "com.assignment2.demo.dto",
        "com.assignment2.demo.model", "com.assignment2.demo.repository",
        "com.assignment2.demo.service","com.assignment2.demo.config"}, exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class Assignment2Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignment2Application.class, args);
    }

}

