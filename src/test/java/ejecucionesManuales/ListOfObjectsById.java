package ejecucionesManuales;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ListOfObjectsById {

    @Test
    public void getIdObject(){

        RequestSpecification datoEntrada1= given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .formParam("id",3)
                .formParam("id",5)
                .formParam("id",10);




        Response response =datoEntrada1
                .when()
                .get();
        response.prettyPrint();
        int statusCode=response.getStatusCode();
       Assert.assertEquals(statusCode,200);

    }
}
