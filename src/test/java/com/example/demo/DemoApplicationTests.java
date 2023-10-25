package com.example.demo;

import io.restassured.http.ContentType;
import models.requestModel.UserRequestModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.given;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void test() {
		UserRequestModel user = UserRequestModel.builder()
				.login("")
				.password("")
				.build();


		given()
				.baseUri("http://localhost:8888")
				.contentType(ContentType.JSON)
				.body(user)
				.post("api/data")
				.then()
				.log().all()
				.contentType(ContentType.JSON)
				.statusCode(200);

	}

}
