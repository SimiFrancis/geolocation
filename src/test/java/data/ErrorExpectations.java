package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorExpectations  {
        BAD_REQUEST(
                400,
                "400.031.001",
                "The Request which you have provided is not valid."),
        VERSION_NOT_SUPPORTED(
                404,
                "404.031.002",
                "The version is not supported.");
        private final int    statusCode;
        private final String errorCode;
        private final String errorMessage;
}

