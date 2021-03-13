package com.demo.assignment;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;


@QuarkusTest
public class DemoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/hello")
                .then()
                .statusCode(200)
                .body(is("Hello World!"));
    }


    @Test
    public void testConvertEndpoint() {
        String payload = "{\n" +
                "  \"inputStr\": \"com.SQILLS.assignment an.ot8er Sample.1nput-Str\",\n" +
                "}";


        Response response = given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/api/convertStr")
                .then()
                .extract().response();

        System.out.println(response.statusCode());
    }

}
