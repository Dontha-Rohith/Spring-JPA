/*MyController Comment*/
package com.springjpa.demo.MyJPA.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.demo.MyJPA.dto.MyUser;
import com.springjpa.demo.MyJPA.service.JPAService;

@RestController
public class MyController {

	@Autowired
	JPAService service;

	@RequestMapping(value = "/getUser")
	public Optional<MyUser> getUser(@RequestParam(name = "id") int id) {
		return service.findUserById(id);
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveUser(@RequestBody MyUser user) {
		service.saveUser(user);
		return "User has been successfully saved";
	}

	@RequestMapping(value = "/saveAllUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveAllUser(@RequestBody List<MyUser> user) {
		service.saveAllUser(user);
		return "Users has been successfully saved";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	public String deleteUser(@RequestParam(name = "id") int id) {
		service.DeleteById(id);
		return "Users has been successfully saved";
	}

	@RequestMapping(value = "/getUserByName", method = RequestMethod.GET)
	public List<MyUser> getUserByName(@RequestParam(name = "name") String name) {
		System.out.println(service.findByUser(name));
		return service.findByUser(name);
	}
}
