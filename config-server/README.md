# config-server
This is used to provide runtime configuration properties to all applications.
This will read configuration properties from git repository https://github.com/prashantp91/microservices-config-repo <br />
Your application name and properties file should be matched.


## Local setup
1. git clone
2. Run below commands <br />
   ```
   cd <project-dir>
   mvn package 
   java -jar <jar file path> 
   ```
3. You run ulr's in below format to test the config server
   ```
   http://host:port/your-service-name/profile
   
   ex-
   http://localhost:8888/user-service/dev
   http://localhost:8888/arithmatic-operations-service/dev 
   ```

## Technology
1. Springboot
2. Spring Cloud config server
