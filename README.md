## What is it?

MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.

## Why ?

because Writing mapping code is a tedious and error-prone task that should be automated.

## How ?

MapStruct is an annotation processor which is plugged into the Java compiler that generates bean mappings at compile-time which ensures a high performance, allows for fast developer feedback

## Tasks

### Task 1: Map product domain to dto

1. add gradle dependencies
2. create domain model
3. create dto model
4. create mapper
5. map product to product dto while the `name` property maps to `productName` in the dto

### Task 2: Map dto to product & provide mapper through Spring ioc

1. use inherited mapping
2. set spring as component model in @Mapper

### Task 3: Use default value and achieve mapping of private final properties

1. using default values (if desc is missing add default desc).
2. update ProductDto properties to be private finals

### Task 4: Mapping nested entities

1. introduce order entity that contains list of products
2. introduce order dto
3. introduce order mapping that automatically uses product mapping

### Task 5: Custom mapping (introduce orderSummery a new property that will only appear in the order dto)

1. add `OrderSummeryDto` class. the `OrderSummeryDto` Object will have total number of items and the sum of their price.
2. add `orderSummery` property in the `OrderDto` class
3. add a `default` method in the orders mapping interface

### Task 6: Value mapping

order can have many states in the domain but the api consumer is just concerned with fewer states (IN_PROGRESS,DELIVERED,FAILED)

1. add `OrderStateDto` Enum with the following cases  (`IN_PROGRESS`, `DELIVERED`, `FAILED`).
2. add `OrderState` Enum in the domain package containing all the states.
3. introduce new orderState property in the `Order` class
4. add new mapping interface `OrderStateMapper` to define value mapping between `OrderStateDto` and `OrderState`
5. to use `OrderStateMapper` in `OrderMapper` add `uses = OrderStateMapper.class`

### Task 7: Property generated from expression

the api consumer want to know the exact time that his api request was executed.

1. add new property `requestedAt` in `OrderDto`
2. add expression mapping in `OrderMapper`

### Task 8: Number and date format

add special price format

1. add new property `priceFormatted` in `ProductDto`
2. add numberFormat annotation property in `ProductMapper`
    1. note that mapping does not need to be one to one
3. add new property `originationDate` of type `String` in`ProductDto`
4. add new property `originationDate` type `String` in`ProductDto`
5. add dateFormat annotation property in `ProductMapper`
   1. mapping works perfectly between Date and String (to Dto and also toModel while using `InheritInverseConfiguration`)
   2. tried Gregorian calendar it can work when you are not using `InheritInverseConfiguration` for mapping the other way around

### More features that can be implemented

using before and after

##Final notes


- using ide plugin is recommended
- unmapped target policies and unmapped source policies
- Automatic type conversion applies to:
    - Conversion between primitive types and their respective wrapper types.
        - For example, conversion between `int` and `Integer`, `float` and `Float`, `long` and `Long`, `boolean` and `Boolean` etc.
    - Conversion between any primitive types and any wrapper types.
        - For example, between int and long, byte and Integer etc.
    - Conversion between all primitive and wrapper types and String.
        - For example, conversion between boolean and String, Integer and String, float and String etc.

#### For more examples

- https://www.tutorialspoint.com/mapstruct/
- https://stackabuse.com/guide-to-mapstruct-in-java-advanced-mapping-library/

#### For more content

- [MapStruct talk by Gunnar Morling](https://www.youtube.com/watch?v=nvjqtWQ5zj8)
- [MapStruct by Filip Hrisafov](https://www.youtube.com/watch?v=ICl9gJ4o7Ec)