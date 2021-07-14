package com.example.user.feign;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
//@FeignClient("arithmatic-operations-service")
public interface ArithmaticOperationsServiceFeignClient {
	@PostMapping("/plus")
	public String plus(String input);
	
	@PostMapping("/minus")
	public String minus(String input);
	
	@PostMapping("/divide")
	public String divide(String input);
	
	@PostMapping("/multiply")
	public String multiply(String input);
}
