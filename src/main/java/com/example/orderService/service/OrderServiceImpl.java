package com.example.orderService.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.orderService.entity.ProductOrder;
import com.example.orderService.model.OrderRequest;
import com.example.orderService.repository.OrderRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Long placeOrder(OrderRequest orderRequest) {
		// TODO Auto-generated method stub
		log.info(" placing order with orderRequest="+orderRequest);
		ProductOrder order=ProductOrder.builder()
				.
				amount(orderRequest.getTotalAmount())
				.productId(orderRequest.getProductId())
				.productDate(Instant.now())
				.orderStatus("Created")
				.quantity(orderRequest.getQuantity())
				.build();
		order=orderRepository.save(order);
		log.info(" order id =="+order.getOrderId());
		return order.getOrderId();
	}
	

}
