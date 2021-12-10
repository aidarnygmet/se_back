package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@SpringBootApplication
public class SeBackApplication{

	public static void main(String[] args) {
		SpringApplication.run(SeBackApplication.class, args);
	}

}
