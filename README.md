This is a microservice project based on spring boot

To build the application

`./mvnw spring-boot:run`

`./gradlew bootRun`

`curl -X POST "http://localhost:8080/api/user-service" \
-H "Content-Type: application/json" \
-d '{
"firstName": "John",
"lastName": "Doe",
"userName": "johndoe",
"password": "securePassword",
"nic": "123456789V",
"address": "123 Main St, City",
"userType": "ADMIN"
}'`

@RequestBody - This need to map the json body to dto
@Service - This need to add for the impl class also. otherwise it will not able to resolve the dependency.
Unlike spring, we don't need to use the @Configuration and @Bean for the dependency injection. that part has been automated here. 

We need both UserDTO and User Entity
UserDTO - dealing with the client requests.
UserEntity - dealing with the database persistence.
