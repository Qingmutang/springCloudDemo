package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class OrderFeignController {
	
	
	@GetMapping("/order")
	public List<String> getFeignResult(){
		
		return null;
	}

}
