package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteObject {
@Test
    public void deleteObject(){

        RequestSpecification deleteObjecto =given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects");

        Response response=deleteObjecto
                .when()
                .delete("/ff80818190910e080190945584c009f9");
        response.prettyPrint();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);


    }
}
