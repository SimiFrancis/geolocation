package endpoints;

import dtos.RequestObjectDTO;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredUtil {

    public static Response accessGeoLocation(RequestObjectDTO requestObjectDTO){
        return given()
                .contentType(requestObjectDTO.contentType())
                .when()
                .post(Routes.post_url);
    }
    public static Response accessGeoLocationWithPayload(RequestObjectDTO requestObjectDTO){
        return given()
                .contentType(requestObjectDTO.contentType())
                .body(requestObjectDTO.body())
                .when()
                .post(Routes.post_url);
    }
}
