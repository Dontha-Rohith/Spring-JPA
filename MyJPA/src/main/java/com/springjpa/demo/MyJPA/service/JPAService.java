package com.springjpa.demo.MyJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springjpa.demo.MyJPA.dao.UserRepository;
import com.springjpa.demo.MyJPA.dto.MyUser;

@Service
public class JPAService {

	@Autowired
	UserRepository repo;

	public void saveUser(MyUser user) {
		repo.save(user);
	}

	public void saveAllUser(List<MyUser> user) {
		repo.saveAll(user);
	}

	public Optional<MyUser> findUserById(int id) {
		Optional<MyUser> user = repo.findById(id);
		return user;
	}

	public void DeleteById(int id) {
		repo.deleteById(id);
	}

	public List<MyUser> findByUser(String name) {
		return repo.findByUname(name);
	}
}
