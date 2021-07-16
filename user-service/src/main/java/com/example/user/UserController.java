package com.example.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.OperationData;
import com.example.user.feign.ArithmaticOperationsServiceFeignClient;

@RestController
public class UserController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ArithmaticOperationsServiceFeignClient arithmaticOptClient;

	@GetMapping("/ping")
	String ping() {
		System.out.println("called");
		return "Hello, Server is up and running";
	}

	@PostMapping("/perform")
	String perform(@RequestBody OperationData opData) {

		String result;

		HttpEntity<?> request = buildRequest(opData);
		System.out.println(request.getBody());
		
		ResponseEntity<String> apiResponse = null;
		switch (opData.getOperation()) {
		case "+":
			apiResponse = restTemplate.postForEntity("http://localhost:8081/plus", request, String.class);
			result = apiResponse.getBody();
			break;
		case "-":
			apiResponse = restTemplate.postForEntity("http://localhost:8081/minus", request, String.class);
			result = apiResponse.getBody();
			break;
		case "*":
			apiResponse = restTemplate.postForEntity("http://localhost:8081/multiply", request, String.class);
			result = apiResponse.getBody();
			break;
		case "/":
			apiResponse = restTemplate.postForEntity("http://localhost:8081/divide", request, String.class);
			result = apiResponse.getBody();
			break;
		default:
			result = "Operation not allowed";
		}

		return result;
	}

	private HttpEntity<?> buildRequest(OperationData opData) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		Map<String, String> params = new HashMap<String, String>();
		params.put("numone", opData.getNumone());
		params.put("numtwo", opData.getNumtwo());

		return new HttpEntity<>(params, headers);
	}

	@PostMapping("/hello")
	String hello(@RequestBody String name) {
		System.out.println(name);
		String result = arithmaticOptClient.hello(name);
		return result;
	}

}
