package com.dakhakhny.mapstruct.demo.application.mapper;

import org.mapstruct.Mapper;

import com.dakhakhny.mapstruct.demo.application.dto.OrderDto;
import com.dakhakhny.mapstruct.demo.core.domain.model.Order;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {
	public abstract OrderDto mapOrder(Order order);
}
