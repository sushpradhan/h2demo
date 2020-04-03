package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean save(User user) {
		userRepository.save(user);
		return false;
	}

	@Override
	public boolean delete(User user) {
		return false;
	}

	@Override
	public List<User> getalluser() {
		
		return (List<User>) userRepository.findAll();
	}



}
