package com;

import com.service.ChildOneService;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class SampleCode {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        visitor.display(new ChildOneService());
    }
}
