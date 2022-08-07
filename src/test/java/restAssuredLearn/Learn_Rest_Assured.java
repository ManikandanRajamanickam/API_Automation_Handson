package restAssuredLearn;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import io.cucumber.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Learn_Rest_Assured {
	
 
	public void getCall() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		response.prettyPrint();
		response.getStatusCode();
		response.getBody().prettyPrint();
		 
		int statusCode = response.getStatusCode();
		assertEquals(statusCode, 200);
		
	}
 
}
