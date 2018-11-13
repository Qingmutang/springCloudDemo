package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
public interface IMemberController {
	
	@GetMapping("/getMember")
	public List<String> getMemberList();

}
