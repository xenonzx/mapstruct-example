
What is it?
MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.

Why ?
because Writing mapping code is a tedious and error-prone task that should be automated.

How?
MapStruct is an annotation processor which is plugged into the Java compiler that generates bean mappings at compile-time which ensures a high performance, allows for fast developer feedback

task 1: map product domain to dto
1. add gradle dependencies
2. create domain model 
3. create dto model
4. create mapper
5. map product to product dto while the `name` property maps to `productName` in the dto
 
task 2: map dto to product & provide mapper through Spring ioc
1. use inherited mapping 
2. set spring as component model in @Mapper

task 3: use default value and achieve mapping of private final properties 
1. using default values (if desc is missing add default desc).
2. update ProductDto properties to be private finals

ideas
use nested mapping
use expressions
use dateformate and number format
use value mapping , custom mapping 

for more examples
https://www.tutorialspoint.com/mapstruct/
https://stackabuse.com/guide-to-mapstruct-in-java-advanced-mapping-library/