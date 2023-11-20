package dtos;

import io.restassured.http.ContentType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.util.MultiValueMap;

@Getter
@Setter
@Accessors(fluent = true)
public class RequestObjectDTO {
    private String version = "v1";
    private String url="https://www.googleapis.com/geolocation";
    private String resourcePath="/geolocate?key=AIzaSyBlzPbU5AtO6SJ_35Sbc8FnAfsTi5a-mQQ";
    private MultiValueMap<String,String> queryParams;
    private ContentType contentType;
    private GeolocationRequest body;
}
