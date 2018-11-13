package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class OrderGetController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getRemote")
	public List<String>  getRemoteServiceData(){
		List result = restTemplate.getForObject("http://service-member/member/getMember", List.class);
		return result;
	}
	
}
