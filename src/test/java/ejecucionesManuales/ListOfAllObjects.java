package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ListOfAllObjects {
    @Test
    public void getAllObjects(){
        RequestSpecification datosEntrada=given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects");
        Response response=datosEntrada
                .when()
                .get();
        response.prettyPrint();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
}
