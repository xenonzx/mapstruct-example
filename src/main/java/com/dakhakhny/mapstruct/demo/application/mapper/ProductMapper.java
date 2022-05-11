package com.dakhakhny.mapstruct.demo.application.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dakhakhny.mapstruct.demo.application.dto.ProductDto;
import com.dakhakhny.mapstruct.demo.core.domain.model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	// ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	@Mapping(source = "name", target = "productName")
	@Mapping(source = "desc", target = "desc", defaultValue = "new arrival")
	@Mapping(source = "manufacturer.country", target = "country")
	@Mapping(source = "price" , target = "priceFormatted",  numberFormat = "$#.00")
	@Mapping(source = "originationDate" , target = "originationDate",  dateFormat = "dd.MM.yyyy")
	ProductDto productToDto(Product product);

	@InheritInverseConfiguration
	Product dtoToProduct(ProductDto productDto);

}
