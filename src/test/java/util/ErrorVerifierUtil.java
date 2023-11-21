package util;

import dtos.ResponseDomainErrorDTO;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ErrorVerifierUtil {
    public static void verifyErrorRecords(final Response response, final String[] expectedErrorMessages){
        ResponseDomainErrorDTO actualResponse = getErrorObjectFromResponse(response);
        IntStream
                .range(0, actualResponse.getError().details.get(0).fieldViolations.size())
                .forEach(i -> assertTrue(actualResponse.getError().details.get(0).fieldViolations
                                .get(i).description.toString()
                                .contains(Arrays
                                        .stream(expectedErrorMessages)
                                        .toArray()[i].toString()),
                        "\nActual Message: " + actualResponse.getError().details.get(0).fieldViolations
                                .get(i).description.toString()
                                + "\nExpected Message: " + Arrays
                                .stream(expectedErrorMessages)
                                .toArray()[i].toString()));
    }
    private static ResponseDomainErrorDTO getErrorObjectFromResponse(final Response response) {
        return response
                .getBody().as(ResponseDomainErrorDTO.class);
    }
}
