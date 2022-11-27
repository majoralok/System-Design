package com;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        ProductModuleMap productModuleMap = ProductModuleMap.EQD;
        Injector injector = Guice.createInjector(productModuleMap.getGuiceModule());
        Helper helper = injector.getInstance(Helper.class);
        helper.execute();
        Guice.createInjector(ProductModuleMap.IRD.getGuiceModule());
        helper.execute();
    }
}
