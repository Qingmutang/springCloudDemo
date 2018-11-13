package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-member")
public interface OrderFeignService{

	@GetMapping("/member/getMember")
	public List<String> getMemberList();
}
