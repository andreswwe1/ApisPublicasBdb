package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class UpdateObject {
@Test
    public void putUpdateObject(){

        File putBody=new File("src/main/resources/updateObject.json");
        RequestSpecification actualizarRegistro =given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .header("Content-Type","application/json")
                .body(putBody);

        Response response= actualizarRegistro
                .when()
                .put("/ff80818190910e080190945584c009f9");
        response.prettyPrint();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);



    }
}
