package com.dakhakhny.mapstruct.demo.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dakhakhny.mapstruct.demo.application.dto.OrderDto;
import com.dakhakhny.mapstruct.demo.application.dto.OrderSummeryDto;
import com.dakhakhny.mapstruct.demo.core.domain.model.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {
	@Mapping(source = "order", target = "orderSummery")
	OrderDto mapOrder(Order order);

	default OrderSummeryDto generateOrderSummery(Order order) {
		final int count = order.getProducts().size();
		final Double orderPrice = order.getProducts().stream()
				.map(product -> product.getPrice())
				.reduce(0.0, (subtotal, productPrice) -> subtotal + productPrice);
		return new OrderSummeryDto(count, orderPrice);

	}
}
