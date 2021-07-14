package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.feign.EmailServiceFeignClient;
import com.example.user.services.UserService;

@RestController
public class UserController {

//	@Autowired
//	RestTemplate restTemplate;

	@Autowired
	UserService userService;
	
	@Autowired
	EmailServiceFeignClient emailClient;

//	private static final String URL = "http://localhost:8081/email";

	@GetMapping("/ping")
	String ping() {
		System.out.println("called");
		return "Hello, Server is up and running";
	}
	
	@PostMapping("/sendEmail")
	String sendEmail(@RequestBody User user) {
		return emailClient.sendEmail(user.getEmail());
	}
	
	@PostMapping("/user")
	String createUser(@RequestBody User user) {
		System.out.println(user.getFirstname());
		String userResponses = userService.createUser(user);
		String result = emailClient.sendEmail(user.getEmail());
//		ResponseEntity<String> result = restTemplate.postForEntity(URL, user.getEmail(), String.class);
//		return userResponses + " and " + result.getBody();
		return userResponses + " and " + result;
	}

	@PutMapping("/user/{id}")
	User updateUser(@PathVariable String id) {
		User user = userService.getUser(id);
		System.out.println(user.toString());
		return user;
	}

	@GetMapping("/user/{id}")
	User getUser(@PathVariable String id) {
		User user = userService.getUser(id);
		System.out.println(user.toString());
		return user;
	}
	
	@GetMapping("/users")
	List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
