package RestAssured;

import org.testng.annotations.Test;

import javax.swing.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DemoAPI {


    @Test
    void testBasicAuthentication ()
    {
            given()
                    .auth().digest("postman", "password")
            .when()
                    .get("https://postman-echo.com/basic-auth")
            .then()
                    .statusCode(200)
                    .body("authenticated",equalTo(true))
                    .log().all();
    }

}
