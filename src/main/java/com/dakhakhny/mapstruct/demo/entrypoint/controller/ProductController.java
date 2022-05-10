package com.dakhakhny.mapstruct.demo.entrypoint.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakhakhny.mapstruct.demo.application.dto.ProductDto;
import com.dakhakhny.mapstruct.demo.application.mapper.OrderMapper;
import com.dakhakhny.mapstruct.demo.application.mapper.ProductMapper;
import com.dakhakhny.mapstruct.demo.infrastructure.OrderRepository;
import com.dakhakhny.mapstruct.demo.infrastructure.ProductsRepository;

@RestController
public class ProductController {

	@Autowired
	ProductMapper productMapper;

	@Autowired
	OrderMapper orderMapper;

	@Autowired
	ProductsRepository productsRepository;

	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/product")
	List<ProductDto> getProducts() {
		List<ProductDto> ret = productsRepository.getAllProducts().stream().map(it -> productMapper.productToDto(it)).collect(Collectors.toList());
		return ret;
	}

	@PostMapping("/product")
	void addProduct(@RequestBody ProductDto prod) {
		productsRepository.addProduct(productMapper.dtoToProduct(prod));
	}
}
