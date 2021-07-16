package com.example.arithmatic.operations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.arithmatic.operations.entity.Operands;

@RestController
public class ArithmaticOperationsController {

	@GetMapping("/ping")
	String ping() {
		System.out.println("called");
		return "Hello, Server is up and running";
	}

	@PostMapping("/hello")
	String hello(@RequestBody String name) {
		System.out.println("hello service called..");
		return "Hello, " + name;
	}

	@PostMapping("/plus")
	Operands plus(@RequestBody Operands input) {
		System.out.println("plus operation will performed.");
		input.setResult(String.valueOf(Integer.parseInt(input.getNumone()) + Integer.parseInt(input.getNumtwo())));
		input.setOperation("+");
		return input;
	}

	@PostMapping("/minus")
	Operands minus(@RequestBody Operands input) {
		System.out.println("minus operation will performed.");
		input.setResult(String.valueOf(Integer.parseInt(input.getNumone()) - Integer.parseInt(input.getNumtwo())));
		input.setOperation("-");
		return input;
	}

	@PostMapping("/multiply")
	Operands multiply(@RequestBody Operands input) {
		System.out.println("multiply operation will performed.");
		input.setResult(String.valueOf(Integer.parseInt(input.getNumone()) * Integer.parseInt(input.getNumtwo())));
		input.setOperation("*");
		return input;
	}

	@PostMapping("/divide")
	Operands divide(@RequestBody Operands input) {
		System.out.println("divide operation will performed.");
		if (Integer.parseInt(input.getNumtwo()) != 0) {
			input.setResult(String.valueOf(Integer.parseInt(input.getNumone()) / Integer.parseInt(input.getNumtwo())));
		} else {
			input.setResult("Cannot divide by zero");
		}
		input.setOperation("/");
		return input;
	}
}
