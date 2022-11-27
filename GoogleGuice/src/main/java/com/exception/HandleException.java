package com.exception;

public class HandleException {
    public String get(String str) throws Exception {
        if(str.equals("Alok"))
            throw new Exception("Invalid name");
        return "Alok";
    }
}
