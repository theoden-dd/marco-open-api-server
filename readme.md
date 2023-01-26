# Run

To run the backend in the developer Tomcat Server:

```shell script
cd backend
mvn spring-boot:run
```

To test that it returns some result run in another terminal:

```shell script
curl localhost:8080/tasks
```

Example output (it was initially):

```json
[
  {
    "task_id":null,"name":"Send hello from Spring Boot","priority":null,"created at":null
  }
]
```
