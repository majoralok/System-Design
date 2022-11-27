package com.module;

import com.Resource.ChildTwoResource;
import com.Resource.ParentResource;
import com.service.ChildTwoService;
import com.service.ParentService;

public class ChildTwoModule extends MyGuiceModule {
    public ChildTwoModule() {
        System.out.println("Executing ChildTwoModule");
    }

    @Override
    protected void overrideConfiguration() {
        bind(ParentResource.class).to(ChildTwoResource.class);
        bind(ParentService.class).to(ChildTwoService.class);
    }
}
