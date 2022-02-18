package com.uibank;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class Base {
	public static String userId = "";
	public static String id = "";

	@BeforeTest
	public void initialSetUp() {
		RestAssured.baseURI = "https://uibank-api.azurewebsites.net/api";
	}

}
