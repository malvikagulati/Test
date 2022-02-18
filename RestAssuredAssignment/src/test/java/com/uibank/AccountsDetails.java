package com.uibank;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AccountsDetails extends Base {

	@Test(dependsOnMethods = "com.uibank.Login.verifyLogin")
	public void verifyAccountDetails() {

		Response response = given().contentType(ContentType.JSON).header("Authorization", id)
				.queryParam("filter[where][userId]", userId).when().get("/accounts");

		System.err.println(response.statusCode());

		response.prettyPrint();

	}

}
