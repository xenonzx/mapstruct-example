package com.dakhakhny.mapstruct.demo.core.domain.model;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
	final long skuNumber;
	final String name;
	final String desc;
	final Double price;
	final int availableQuantity;
	final String season;
	final Date originationDate;
	final Manufacturer manufacturer;
}

