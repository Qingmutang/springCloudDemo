package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="service-member",fallback=OrderFeignFallBackService.class)
public interface OrderFeignService{

	@GetMapping("/member/getMember")
	public List<String> getMemberList();
}
