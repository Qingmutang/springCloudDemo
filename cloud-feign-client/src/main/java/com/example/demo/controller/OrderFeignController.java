package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderFeignService;

@RestController
@RequestMapping("/feign")
public class OrderFeignController {
	
	@Autowired
	OrderFeignService feignService;
	
	@GetMapping("/order")
	public List<String> getFeignResult(){
		
		return feignService.getMemberList();
	}

}
