#Spring-MongoDB-embedded: Model One-to-One, One-to-Many Relationships Embedded Documents (collections).
- The REST API has been built with Spring boot with MongoDB for this demo.
- Project: Maven
- Application Framework: Spring Boot (2.7.1)
- Language: Java (8)
- Packaging: Jar
- Dependencies (Spring Web, Lombok, Spring Data Mongo, Spring Devtools, Spring Test, junit, Springfox(Swagger2), Jackson and jCoCo).
- Change application.properties for DB connection attributes (db name, user and password) when required.

## Architecture
- One user can have multiple products and user has one address.
-![architecture](architecture.png)


## Endpoints
- http://localhost:2024/api/orders -Place Order.
- http://localhost:2024/api/orders{firstName} -Get all orders by user first name.
- http://localhost:2024/api/orders/addresses/{city} -Get all orders by city.
- http://localhost:2024/api/orders -Update order.
- http://localhost:2024/api/orders/{id} -Delete order by user Id.
- Validations:
- id  -The "id" must be numeric and between 1 and max integer.
- firstName -The"firstName" is required &  it must be at least 3 characters. The firstName must be one word.
- address -The "address" is requried.
- city -The city of the address must be at least 3 characters. The city name must be one word.
- products -At least one product is required to place order.
- name -The name of "product' must not be empty and it must be at least 3 characters.
 
 
## API Documentations 
-![swagger2](swagger2.png)
- http://localhost:2024/swagger-ui/index.html -Swagger2 API documentation 


## Import postman collections to test APIs
-![postman](postman.PNG)

## Test Coverage By jCoCO 
-![jcoco-test-coverage](jcoco-test-coverage.PNG)
