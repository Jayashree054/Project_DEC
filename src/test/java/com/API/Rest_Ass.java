package com.API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Ass {

	@Test
	private void rest_api() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response response = req.get("/api/users/2");
		// asstring-give the response body
		System.out.println(response.asString());
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusLine());
		Assert.assertEquals(statusCode, 200); //hardassert
		System.out.println("Assert Validation");

	}

}
