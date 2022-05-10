
### What is it?

MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.

### Why ?

because Writing mapping code is a tedious and error-prone task that should be automated.

### How ?

MapStruct is an annotation processor which is plugged into the Java compiler that generates bean mappings at compile-time which ensures a high performance, allows for fast developer feedback
###Tasks

#### Task 1: map product domain to dto

1. add gradle dependencies
2. create domain model 
3. create dto model
4. create mapper
5. map product to product dto while the `name` property maps to `productName` in the dto

#### Task 2: map dto to product & provide mapper through Spring ioc
1. use inherited mapping 
2. set spring as component model in @Mapper

#### Task 3: use default value and achieve mapping of private final properties 
1. using default values (if desc is missing add default desc).
2. update ProductDto properties to be private finals


#### Task 4: mapping nested entities
1. introduce order entity that contains list of products
2. introduce order dto
3. introduce order mapping that automatically uses product mapping

#### ideas
use expressions
use dateformate and number format
use value mapping , custom mapping 

final notes
--
Automatic type conversion applies to:
Conversion between primitive types and their respective wrapper types. For example, conversion between int and Integer, float and Float, long and Long, boolean and Boolean etc.
Conversion between any primitive types and any wrapper types. For example, between int and long, byte and Integer etc.
Conversion between all primitive and wrapper types and String. For example, conversion between boolean and String, Integer and String, float and String etc.

for more examples
https://www.tutorialspoint.com/mapstruct/
https://stackabuse.com/guide-to-mapstruct-in-java-advanced-mapping-library/