package com.dakhakhny.mapstruct.demo.core.domain.model;

public enum OrderState {
	/**
	 * order was placed in the system
	 * */
	PLACED,

	/**
	 * order was picked by a Handler And Is Being Prepared
	 * */
	PREPARING,

	/**
	 * order was prepared
	 * */
	PREPARED,

	/**
	 * order was moved to the delivery pickup point
	 * */
	ORDER_IN_DELIVERY_PICKUP_POINT,

	DELIVERY_INPROGRESS,

	DELIVERY_FAILED,

	DELIVERED
}
