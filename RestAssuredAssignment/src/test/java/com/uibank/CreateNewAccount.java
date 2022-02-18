package com.uibank;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateNewAccount extends Base {
	@Test(dependsOnMethods = "com.uibank.Login.verifyLogin")
	public void createNewAccount() {

		Response response = given().contentType(ContentType.JSON)
				.body("{\r\n" + "    \"friendlyName\": \"MalvikaTest\",\r\n" + "    \"type\": \"savings\",\r\n"
						+ "    \"userId\": \"612ad502f6518100401b5217\",\r\n" + "    \"balance\": 100,\r\n"
						+ "    \"accountNumber\": 35543607\r\n" + "}")
				.header("Authorization", id).when().post("/accounts");

		System.err.println(response.statusCode());

		response.prettyPrint();
	}

}
