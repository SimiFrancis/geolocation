package tests;

import endpoints.RestAssuredUtil;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.Base;
import util.HeaderUtil;

public class GeoLocationTests extends Base {
    @Test
    @DisplayName("Get geo location details without body")
    public void GetGeoLocationDetailsWithDefaultValues() {
        var requestDTO = requestObjectBuilder.buildRequestObject(HeaderUtil.defaultHeaders.get());
        Response response = RestAssuredUtil.accessGeoLocation(requestDTO);
        Assertions.assertEquals(response.statusCode(),200);
    }

    @Test
    @DisplayName("Get geo location details with body")
    public void GetGeoLocationWithValidRequest() {
        var requestDTO = requestObjectBuilder.buildRequestObjectWithPayload(HeaderUtil.defaultHeaders.get(), payloads.payload.get());
        Response response = RestAssuredUtil.accessGeoLocationWithPayload(requestDTO);
        Assertions.assertEquals(response.statusCode(),200);
    }
}
