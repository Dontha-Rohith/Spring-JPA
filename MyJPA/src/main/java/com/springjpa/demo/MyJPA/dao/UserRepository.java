package com.springjpa.demo.MyJPA.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.demo.MyJPA.dto.MyUser;

@Repository
public interface UserRepository extends CrudRepository<MyUser, Integer> {

	public List<MyUser> findByUname(String name);
}
