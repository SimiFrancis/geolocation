package dtos;

import java.util.ArrayList;

public class Error {
    public int code;
    public String message;
    public ArrayList<Error2> errors;
    public String status;
    public ArrayList<Detail> details;
}
