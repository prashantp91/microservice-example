# microservices
### What are microservices?
Microservices - also known as the microservice architecture - is an architectural style that structures an application as a collection of services that are

1. Highly maintainable and testable
2. Loosely coupled
3. Independently deployable
4. Organized around business capabilities
5. Owned by a small team

The microservice architecture enables the rapid, frequent and reliable delivery of large, complex applications. It also enables an organization to evolve its technology stack.

https://microservices.io/

Basic Diagram             |  Complete Architecture
:-------------------------:|:-------------------------:
![](https://lh3.googleusercontent.com/proxy/1cp9nRBM3Vub9wKgJIdFwRR3mSSrSVfWORKEE-fGPK2NK6eWI9CiS58hGWokL-nPL35FyC5BkPA6fGW9TnOYE-uovsHAopZTPSpOy5ttpVw)  |  ![](doc/microservice-architect.png)


## Concepts implemented
1. [Eureka server](https://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html) - It is used to provides as a discovery server for applications. This server maintains and distributes a dynamic list of available application instances that are then used by the microservices to do HTTP requests routing and load balancing.
2. [Swagger](https://swagger.io/) - It allows you to describe the structure of your APIs so that machines can read them. The ability of APIs to describe their own structure is the root of all awesomeness in Swagger.
3. [Spring Cloud Config server](https://cloud.spring.io/spring-cloud-config/spring-cloud-config.html) - It is used to provide runtime configuration properties to all applications.
4. [Spring Cloud Openfeign](https://cloud.spring.io/spring-cloud-openfeign/reference/html/) - It is a declarative web service client. It makes writing web service clients easier. To use Feign create an interface and annotate it. Spring Cloud integrates Eureka, as well as Spring Cloud LoadBalancer to provide a load-balanced http client when using Feign. It provides client side load balencer in round robbin fassion.



## Local setup
1. git clone <repo url>
2. Start/deploy all services.
3. Open Swagger url http://localhost:8080/swagger-ui.html
4. Open Eureka url http://localhost:8761/
5. To test Feign service 
   Open 2 command prompts and below command on each 
   ``` 
   cd arithmatic-operations-service 
   mvn package 
   java -jar target\arithmatic-operations-service-0.0.1-SNAPSHOT.jar --server.port=8083
   Note - use unique port number for each cmd/instance
  ```
  Then hit the url from postman 
  POST: http://localhost:8080/hello
  BODY: {
          "name" : "prashant"
        }
  
  
## Technology
1. Springboot
2. Swagger
3. Eureka
