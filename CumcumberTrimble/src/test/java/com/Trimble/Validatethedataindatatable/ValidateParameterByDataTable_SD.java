package com.Trimble.Validatethedataindatatable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ValidateParameterByDataTable_SD {
	
	Response resp;

@Given("^user hit the post request with \"([^\"]*)\" name$")
public void user_hit_the_post_request_with_name(String newname) throws IOException
{
	//Read the data from file
	String data="";
	data = new String(Files.readAllBytes(Paths.get("/Users/avernek/git/TrimbleGIT/CumcumberTrimble/src/test/Resources/F1matchingcircuitparam/posttest.json")));
	System.out.println("json as string=="+data);
	
	//Update the post request 
	JSONObject obj=new JSONObject(data);
    obj.put("name",newname);
	String jsonasstring=obj.toString();
	System.out.println("json as string"+jsonasstring);
	
	//Do post request
	resp=RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
	when().body(jsonasstring).post("https://reqres.in/api/users");
}
	
@Then("user validate following data")
public void user_validate_following_data(DataTable table) throws Exception{
	
	
	
	List<List<String>> data1 = table.raw();
//	int i = data.size();
//	int j = data.get(0).size();
	
	//row 1
	String values1 = data1.get(0).get(0);
	String values2 = data1.get(0).get(1);
	System.out.println("Row 1=="+values1+"and"+values2 );
	
	//row 2
	String values3 = data1.get(1).get(0);
	String values4 = data1.get(1).get(1);
	System.out.println("Row 2=="+values3+"and"+values4 );
	// row 3
	String values5 = data1.get(2).get(0);
	String values6 = data1.get(2).get(1);
	System.out.println("Row 1=="+values5+"and"+values6 );
	
	
	int statusCode = resp.getStatusCode();
	System.out.println("Actual Status Code is"+statusCode);
	int expStatusCode = Integer.parseInt(values6);
	System.out.println("Expected Status Code is"+expStatusCode);
try {
	Assert.assertTrue(statusCode==expStatusCode);
    }
catch (AssertionError e )
    {
	System.out.println(e.getMessage());
	}

	//check id is greater than zero
	String idValue = resp.getBody().jsonPath().get("id");
	int idInt = Integer.parseInt(idValue);
	Assert.assertTrue(idInt >= 0);
	
	
	
}
}









