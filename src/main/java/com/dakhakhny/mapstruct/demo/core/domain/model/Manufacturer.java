package com.dakhakhny.mapstruct.demo.core.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Manufacturer {
	final String country;
	final String name;
	final String phone;
}
