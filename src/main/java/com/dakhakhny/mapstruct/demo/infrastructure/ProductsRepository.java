package com.dakhakhny.mapstruct.demo.infrastructure;

import com.dakhakhny.mapstruct.demo.core.domain.model.Product;
import lombok.NonNull;

import java.util.List;


public interface ProductsRepository {

    @NonNull
    List<Product> getAllProducts();
}
