package com.dakhakhny.mapstruct.demo.entrypoint.controller;

import com.dakhakhny.mapstruct.demo.application.dto.ProductDto;
import com.dakhakhny.mapstruct.demo.application.mapper.ProductMapper;
import com.dakhakhny.mapstruct.demo.infrastructure.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    ProductsRepository repo;

    @GetMapping("/product")
    List<ProductDto> getProducts() {
        List<ProductDto> ret = repo.getAllProducts().stream().map(it -> ProductMapper.INSTANCE.productToDto(it)).collect(Collectors.toList());
        return ret;
    }

    @PostMapping("/product")
    void addProduct(@RequestBody ProductDto prod){
        repo.addProduct(ProductMapper.INSTANCE.dtoToProduct(prod));
    }
}
