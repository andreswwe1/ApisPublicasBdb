package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class PartiallyUpdateObject {

@Test
    public  void patchPartiallyUpdateObject(){

        File patchBody = new File("src/main/resources/partiallyUpdateObject.json");

        RequestSpecification actualizarSeccion = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .header("Content-Type","application/json")
                .body(patchBody);

        Response response = actualizarSeccion
                .when()
                .patch("/ff80818190910e080190945584c009f9");

        response.prettyPrint();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
}
