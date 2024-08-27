package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleObject {

@Test
    public void getSingleObject() {

        RequestSpecification datoEntrada = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects");

        Response response= datoEntrada
                .when()
                .get("/ff80818190910e080190945584c009f9");
        response.prettyPrint();
         int statusCode=response.getStatusCode();
         Assert.assertEquals(statusCode,200);



    }
}
