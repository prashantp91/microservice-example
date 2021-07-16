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


## Concepts used
1. [Eureka server](https://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html) - It is used to provides as a discovery server for applications. This server maintains and distributes a dynamic list of available application instances that are then used by the microservices to do HTTP requests routing and load balancing.
2. [Swagger](https://swagger.io/) - It allows you to describe the structure of your APIs so that machines can read them. The ability of APIs to describe their own structure is the root of all awesomeness in Swagger.


## Local setup
1. git clone <repo url>
2. Start/deploy all services.
3. Open Swagger url http://localhost:8080/swagger-ui.html
4. Open Eureka url http://localhost:8761/

## Technology
1. Springboot
2. Swagger
3. Eureka
