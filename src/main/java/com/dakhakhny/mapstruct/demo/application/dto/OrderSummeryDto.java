package com.dakhakhny.mapstruct.demo.application.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderSummeryDto {
	private final int itemCount;
	private final Double price;
}
