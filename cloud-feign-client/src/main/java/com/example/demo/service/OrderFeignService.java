package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.example.demo.controller.IOrderController;

@FeignClient("service-order")
public interface OrderFeignService extends IOrderController{

}
