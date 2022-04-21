package com.dakhakhny.mapstruct.demo.core.domain.model;


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
    // season is a property that we dont want to show it to user according to our business logic
    final String season;
}

