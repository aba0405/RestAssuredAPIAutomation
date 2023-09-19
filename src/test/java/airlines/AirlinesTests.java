package airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;

public class AirlinesTests {

    @Test
    public void createAirlines(){
        String endPoint = "https://api.instantwebtools.net/v1/airlines";
        String payload = Payloads.getCreateAirlinePayload("1254697", "Spirit", "USA", "ACE", "Their-Slogan", "New York", "wwwdpt", "2023");
    Response response = RestUtils.performPost(endPoint, payload, new HashMap<>());
    Assert.assertEquals(response.statusCode(),200);

    }
}
