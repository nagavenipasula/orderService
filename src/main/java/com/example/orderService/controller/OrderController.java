package com.example.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderService.model.OrderRequest;
import com.example.orderService.service.OrderService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/order")
@Log4j2
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value="/placeorder")
	public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest orderRequest){
		
		Long orderId=orderService.placeOrder(orderRequest);
		log.info("orderId=="+orderId);
		return new ResponseEntity<Long>(orderId,HttpStatus.OK);
		
	}
	

}
