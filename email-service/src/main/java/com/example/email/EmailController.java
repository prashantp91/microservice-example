package com.example.email;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@PostMapping("/email")
	String sendMail(@RequestBody String email) {
		return "email sent...";
	}
}
