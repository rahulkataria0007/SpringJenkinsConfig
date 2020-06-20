package com.example.SpringJenkinBuild.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJenkinBuild.beans.User;
import com.example.SpringJenkinBuild.components.UserComponent;
import com.example.SpringJenkinBuild.exceptions.CustomUserNotFoundException;


@RestController
@RequestMapping("/users")
public class ApplicationController {
	
	@Autowired
	UserComponent userComp;
	
	@GetMapping(value="/")
	public String initalMessage() {
		
		return "Hello Boot";
	}
	
	@GetMapping(value="/getUserList")
	public List<User> getUserList(){
		return userComp.userList();
	}
	
	@GetMapping(value="/getUser/{id}")
	public User getUser(@PathVariable int id){
		System.out.println("Id must be 0,1,2");
		//return userComp.findUserById(id);
		User user= userComp.findUserById(id);
    	if(user==null) {
    		throw new CustomUserNotFoundException("id :"+ id);
    	}
    	return user;
	}
	
	@PostMapping(value="/addUser")
	public List<User> getUserList(@Valid @RequestBody User user){
		System.out.println("fdsfds");
		 return userComp.addUser(user.getUserId(),user.getUserName(),user.getUserPass());
		
		/*
		 * URI location=ServletUriComponentsBuilder .fromCurrentRequest() .path("/{id}")
		 * .buildAndExpand(user.getUserId()).toUri();
		 * 
		 * return ResponseEntity.created(location).build();
		 */		 
	}
	
	@DeleteMapping(value="/deleteUser/{id}")
	public User deleteUser(@PathVariable int id){
		
		return userComp.deleteUserById(id);
	}
	
	@PutMapping("/updateUser/{id}/{newpass}")
	public boolean updateUser(@PathVariable int id,@PathVariable String newpass){
		
		return userComp.updateUser(id,newpass);
	}
	

}
