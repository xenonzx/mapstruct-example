package com.dakhakhny.mapstruct.demo.application.mapper;

import com.dakhakhny.mapstruct.demo.application.dto.ProductDto;
import com.dakhakhny.mapstruct.demo.core.domain.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

   // ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "name", target = "productName")
    ProductDto productToDto(Product product);

    @InheritInverseConfiguration
    Product dtoToProduct(ProductDto productDto);

}
