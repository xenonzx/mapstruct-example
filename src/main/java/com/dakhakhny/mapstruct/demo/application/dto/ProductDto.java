package com.dakhakhny.mapstruct.demo.application.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ProductDto {
	private final long skuNumber;
	private final String productName;
	private final String desc;
	private final Double price;
	private final int availableQuantity;
	private final String season;
	private final String country;
}
