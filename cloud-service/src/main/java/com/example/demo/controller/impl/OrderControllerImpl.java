package com.example.demo.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IOrderController;

@RestController
public class OrderControllerImpl  implements IOrderController{
	public List<String> getOrderList() {
		List<String> result = new ArrayList<String>();
		result.add("lisi");
		result.add("zhangsan");
		return result;
	}

}
