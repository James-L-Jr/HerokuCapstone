package com.hcl.udemy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CapstoneApplication {
	static Logger log = Logger.getLogger(CapstoneApplication.class.getName());
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
    	PropertyConfigurator.configure("C:\\Users\\James\\OneDrive\\Desktop\\Heroku Capstone\\Capstone2\\src\\main\\resources\\log4j.properties");
		log.warn("DB accessed from Application..");
        SpringApplication.run(CapstoneApplication.class, args);
    }
}