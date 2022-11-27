package com;

import com.service.ChildOneService;
import com.service.ChildTwoService;

public class Visitor {

    public void display(ChildOneService childOneService){
        childOneService.getServiceName();
    }

    public void display(ChildTwoService childTwoService){
        childTwoService.getServiceName();
    }
}


