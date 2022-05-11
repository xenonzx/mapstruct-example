package com.dakhakhny.mapstruct.demo.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

import com.dakhakhny.mapstruct.demo.application.dto.OrderStateDto;
import com.dakhakhny.mapstruct.demo.core.domain.model.OrderState;

@Mapper(componentModel = "spring")
public interface OrderStateMapper {
	@ValueMapping( source = "DELIVERY_FAILED", target="FAILED")
	@ValueMapping( source = MappingConstants.ANY_REMAINING, target="IN_PROGRESS")
	OrderStateDto toDto(OrderState state);
}
