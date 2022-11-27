package com.module;

import com.Resource.ChildOneResource;
import com.Resource.ChildTwoResource;
import com.Resource.ParentResource;
import com.service.ChildOneService;
import com.service.ParentService;

public class ChildOneModule extends MyGuiceModule {

    public ChildOneModule() {
        System.out.println("Executing ChildOneModule");
    }

    @Override
    protected void overrideConfiguration() {
        bind(ParentResource.class).to(ChildOneResource.class);
        bind(ParentService.class).to(ChildOneService.class);
    }
}
