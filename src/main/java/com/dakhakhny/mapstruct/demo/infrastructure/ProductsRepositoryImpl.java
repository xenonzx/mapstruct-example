package com.dakhakhny.mapstruct.demo.infrastructure;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dakhakhny.mapstruct.demo.core.domain.model.Manufacturer;
import com.dakhakhny.mapstruct.demo.core.domain.model.Product;
import lombok.NonNull;

@Repository
public class ProductsRepositoryImpl implements ProductsRepository {


	@NonNull
	ArrayList<Product> products = new ArrayList<Product>(

			List.of(
					new Product(1, "product 1:", "short desc", 10.0, 10, "2020", new Date(), null),
					new Product(2, "product 2:", "short desc", 20.0, 10, "2021", new Date(), null),
					new Product(3, "product 3:", "short desc", 30.0, 10, "2022", new Date(), null),
					new Product(4, "rare product :", "short desc", 5.0, 2, "2020", new Date(), null),
					new Product(5, "coming soon product", null, 30.0, 0, "2023", new Date(), new Manufacturer("Egypt", "nike", "1234"))
			)
	);


	@Override
	public ArrayList<Product> getAllProducts() {
		return products;
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}
}
