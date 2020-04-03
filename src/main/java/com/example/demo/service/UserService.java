package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;


public interface UserService {
	
	public boolean save(User user);
	public boolean delete(User user);
	public List<User> getalluser();
	

}
