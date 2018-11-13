package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OrderFeignFallBackService implements OrderFeignService{

	@Override
	public List<String> getMemberList() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("not orderUser list");
		return listUser;
	}

}
