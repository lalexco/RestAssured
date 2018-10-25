import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestClass {
	
	public void testResponsecode() {
		
		Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code = response.getStatusCode();
		
		Assert.assertEquals(code, 200);
			
		
	}
	
	public void testResponseBody()
	{
		Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		String body = response.asString();
		
		System.out.println(body);
		
		//ResponseBody responseBody = response.getBody();
	}

}
