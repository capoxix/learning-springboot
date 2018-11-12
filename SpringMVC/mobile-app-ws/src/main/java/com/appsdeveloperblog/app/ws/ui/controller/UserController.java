package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page", defaultValue="1") int page,
			@RequestParam(value="limit", defaultValue="50") int limit,
			@RequestParam(value="limit", defaultValue="desc", required= false) String sort)
	{
		return "get users was called page = " + page + " and limit =" + limit + "and sort = " + sort;
	}

	@GetMapping(path="/{userId}")
	public UserRest getUser(@PathVariable String userId)
	{
		UserRest returnValue = new UserRest();
		returnValue.setEmail("test@test.com");
		returnValue.setFirstName("Garbo");
		returnValue.setLastName("Cheng");
		
		return returnValue;
	}
	
	@PostMapping 
	public String createUser()
	{
		return "post user request";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "update user request";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "delete user request";
	}
	
}
