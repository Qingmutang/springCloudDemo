package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
public interface IOrderController {
	
	@GetMapping("/getOrderList")
	public List<String> getOrderList();

}
