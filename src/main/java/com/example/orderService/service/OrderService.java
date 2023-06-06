package com.example.orderService.service;

import com.example.orderService.model.OrderRequest;

public interface OrderService {

	Long placeOrder(OrderRequest orderRequest);

}
