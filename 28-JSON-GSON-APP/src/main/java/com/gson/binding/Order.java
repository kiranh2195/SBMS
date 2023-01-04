package com.gson.binding;

import lombok.Data;

@Data
public class Order {
	private Integer orderId;
	private String orderBy;
	private String orderStatus;
	private Double billAmt;
}
