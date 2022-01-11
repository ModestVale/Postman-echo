package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanEchoTest {
    @Test
    void shouldValidResponseFromPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body("{data:\"some data\"}")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("{data:\"some data test\"}"));
    }
}
