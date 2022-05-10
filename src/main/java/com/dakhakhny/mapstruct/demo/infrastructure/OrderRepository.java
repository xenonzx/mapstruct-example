package com.dakhakhny.mapstruct.demo.infrastructure;

import java.util.List;

import com.dakhakhny.mapstruct.demo.core.domain.model.Order;
import com.dakhakhny.mapstruct.demo.core.domain.model.Product;
import lombok.NonNull;


public interface OrderRepository {

    List<Order> getOrders();
}
