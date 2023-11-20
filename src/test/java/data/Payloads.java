package data;

import dtos.GeolocationRequest;
import util.JsonUtil;

import java.io.FileNotFoundException;
import java.util.function.Supplier;

public class Payloads {
    public Supplier<GeolocationRequest> payload = () -> {
        try {
            return JsonUtil.getPojoFromFile("src/test/resources/request.json", GeolocationRequest.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    };
}
