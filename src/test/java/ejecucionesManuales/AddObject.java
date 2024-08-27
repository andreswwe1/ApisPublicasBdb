package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class AddObject {
@Test
    public void postAddObject(){
        File postBody =new File("src/main/resources/addObject.json");

        RequestSpecification AdicionarRegistros=given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .header("content-type","application/json")
                .body(postBody);
        Response response=AdicionarRegistros
                .when()
                .post();
        response.prettyPrint();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
}


