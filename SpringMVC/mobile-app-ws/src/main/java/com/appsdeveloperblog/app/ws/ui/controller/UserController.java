package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page") int page,
			@RequestParam(value="limit") int limit)
	{
		return "get users was called page = " + page + " and limit =" + limit;
	}

	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId)
	{
		return "get user request with userId =" + userId;
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
