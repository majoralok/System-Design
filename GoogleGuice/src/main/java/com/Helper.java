package com;

import com.Resource.ParentResource;
import com.google.inject.Inject;
import com.service.ParentService;

public class Helper {
    @Inject
    ParentService parentService;
    @Inject
    ParentResource parentResource;
     public void execute() {
         parentResource.getResourceName();
         parentService.getServiceName();
     }
}
