package com;

import com.module.ChildOneModule;
import com.module.ChildTwoModule;
import com.module.MyGuiceModule;

public enum ProductModuleMap {
    EQD(new ChildOneModule()),
    IRD(new ChildTwoModule());

    private MyGuiceModule guiceModule;

    ProductModuleMap(MyGuiceModule guiceModule) {
        this.guiceModule = guiceModule;
    }
    public MyGuiceModule getGuiceModule() {
        return guiceModule;
    }


}
