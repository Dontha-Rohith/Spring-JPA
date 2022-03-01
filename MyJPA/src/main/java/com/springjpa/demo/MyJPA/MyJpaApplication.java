package com.springjpa.demo.MyJPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.springjpa.demo.MyJPA.dao.UserRepository;
import com.springjpa.demo.MyJPA.dto.MyUser;
import com.springjpa.demo.MyJPA.service.JPAService;

@SpringBootApplication
public class MyJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJpaApplication.class, args);
//		UserRepository userRepository = context.getBean(UserRepository.class);

	}

}
