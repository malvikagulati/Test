package com.uibank;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ViewProfile extends Base {
	@Test(dependsOnMethods = "com.uibank.Login.verifyLogin")
	public void verifyProfile() {

		Response response = given().contentType(ContentType.JSON).pathParam("userId", userId)
				.header("Authorization", id).when().get("/users/{userId}");

		System.err.println(response.statusCode());

		String firstname = response.jsonPath().get("firstName");
		String email = response.jsonPath().get("email");
		Assert.assertEquals(email, "darshan2877@gmail.com");

		Assert.assertEquals(firstname, "Sudarshan");

		response.prettyPrint();
	}

}
