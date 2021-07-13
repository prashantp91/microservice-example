package com.example.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public String createUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
	
	public User getUser(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
	
	public User updateUser(User user) {
		User updatedUser = userRepository.save(user);
		return updatedUser;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
