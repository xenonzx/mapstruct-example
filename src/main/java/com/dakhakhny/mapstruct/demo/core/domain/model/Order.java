package com.dakhakhny.mapstruct.demo.core.domain.model;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Order {
	final String date;
	final List<Product> products;
	final OrderState orderState;
}
