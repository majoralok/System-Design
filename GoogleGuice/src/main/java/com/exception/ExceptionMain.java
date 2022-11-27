package com.exception;

import com.Helper;
import com.ProductModuleMap;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class ExceptionMain {

    public static void main(String[] args) throws Exception {
        try {
            finalMethod();
        } catch (Exception e) {
            System.out.println("Main Method");
            System.out.println(e.getMessage());
        }
    }

    public static void finalMethod() throws Exception {
        try {
            HandleException handleException = new HandleException();
            handleException.get("Alok");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage(), e);
        }
    }

}
