package com.dakhakhny.mapstruct.demo.application.dto;

import java.util.List;

import com.dakhakhny.mapstruct.demo.core.domain.model.Product;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class OrderDto {
	final String date;
	final List<Product> products;
	final OrderSummeryDto orderSummery;
}
