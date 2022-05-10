package com.dakhakhny.mapstruct.demo.entrypoint.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakhakhny.mapstruct.demo.application.dto.OrderDto;
import com.dakhakhny.mapstruct.demo.application.mapper.OrderMapper;
import com.dakhakhny.mapstruct.demo.infrastructure.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	OrderMapper orderMapper;

	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/order")
	List<OrderDto> getOrders() {
		List<OrderDto> ret = orderRepository.getOrders().stream().map(it -> orderMapper.mapOrder(it)).collect(Collectors.toList());
		return ret;
	}

}
