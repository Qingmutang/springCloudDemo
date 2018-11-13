package com.example.demo.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IMemberController;

@RestController
public class MemberControllerImpl  implements IMemberController{
	
	@Value("${server.port}")
	private String serverPort;
	
	public List<String> getMemberList() {
		List<String> result = new ArrayList<String>();
		result.add("lisi");
		result.add("zhangsan");
		result.add(serverPort);
		
		return result;
	}

}
