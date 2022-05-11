package com.dakhakhny.mapstruct.demo.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dakhakhny.mapstruct.demo.core.domain.model.Manufacturer;
import com.dakhakhny.mapstruct.demo.core.domain.model.Order;
import com.dakhakhny.mapstruct.demo.core.domain.model.OrderState;
import com.dakhakhny.mapstruct.demo.core.domain.model.Product;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
	@Override
	public List<Order> getOrders() {
		ArrayList<Order> orders = new ArrayList<Order>(List.of(
				new Order("", List.of(
						new Product(4, "rare product :", "short desc", 5.0, 2, "2020", null),
						new Product(5, "coming soon product", null, 30.0, 0, "2023", new Manufacturer("Egypt", "nike", "1234"))
				)
						, OrderState.PLACED)
		));
		return orders;
	}
}
