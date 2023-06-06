package com.example.orderService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
	
	private Long productId;
	private Long totalAmount;
	private long quantity;
	private PaymentMode paymentMode;

}
