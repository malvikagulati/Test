package com.uibank;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Login extends Base {

	@Test
	public void verifyLogin() {
		RestAssured.baseURI = "https://uibank-api.azurewebsites.net/api";
		Response response = given().contentType(ContentType.JSON).body(new File("./Data/LoginCredentials.json")).when()
				.post("/users/login");
		System.err.println(response.statusCode());
		response.prettyPrint();
		userId = response.jsonPath().get("userId");
		id = response.jsonPath().get("id");

	}

}
