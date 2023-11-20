package builders;

import dtos.GeolocationRequest;
import dtos.RequestObjectDTO;
import endpoints.Routes;
import io.restassured.http.ContentType;

import java.util.Optional;

public class RequestObjectBuilder {
    public RequestObjectDTO buildRequestObject(ContentType contentType){
        return new RequestObjectDTO()
                .url(Routes.base_url)
                .version(Routes.version)
                .contentType(contentType)
                .resourcePath("/geolocate");
    }

    public <T> RequestObjectDTO buildRequestObjectWithPayload(ContentType contentType, GeolocationRequest payload){
        return new RequestObjectDTO()
                .url(Routes.base_url)
                .version(Routes.version)
                .contentType(contentType)
                .resourcePath("/geolocate")
                .body(payload);
    }
}
