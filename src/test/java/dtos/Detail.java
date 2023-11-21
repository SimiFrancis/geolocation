package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Detail {
    @JsonProperty("@type")
    public String type;
    public ArrayList<FieldViolation> fieldViolations;
}
