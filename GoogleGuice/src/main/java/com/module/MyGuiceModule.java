package com.module;

import com.google.inject.AbstractModule;

public abstract class MyGuiceModule extends AbstractModule {

    @Override
    protected final void configure() {
        overrideConfiguration();
    }

    protected abstract void overrideConfiguration();
}
