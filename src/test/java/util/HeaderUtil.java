package util;

import io.restassured.http.ContentType;

import java.util.function.Supplier;

public class HeaderUtil {
    public static Supplier<ContentType> defaultHeaders = () -> ContentType.JSON;
}
