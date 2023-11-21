package tests;

import endpoints.RestAssuredUtil;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.Base;
import util.ErrorVerifierUtil;
import util.HeaderUtil;

import static data.ErrorExpectations.BAD_REQUEST;


public class GeoLocationInvalidTests extends Base {
    @Test
    @DisplayName("Verify that geo location api returns 400 when invalid homeMobileCountryCode")
    public void invalidHomeMobileCountryCode() {
        var requestDTO = requestObjectBuilder
                .buildRequestObjectWithPayload(
                        HeaderUtil.defaultHeaders.get(), payloads.invalidRequests.get());
        Response response = RestAssuredUtil.accessGeoLocationWithPayload(requestDTO);
        Assertions.assertEquals(response.statusCode(), BAD_REQUEST.getStatusCode());
        ErrorVerifierUtil.verifyErrorRecords(response, new String[]{"Invalid value at 'radio_type' (type.googleapis.com/maps_api.GeolocationRequest.RadioType), \"test\""});
    }
}
