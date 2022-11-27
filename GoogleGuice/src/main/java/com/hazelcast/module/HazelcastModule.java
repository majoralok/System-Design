package com.hazelcast.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastModule extends AbstractModule {

    @Provides
    @Singleton
    public HazelcastInstance getHazelcastInstance() {
        Config cfg = new Config();
        return Hazelcast.newHazelcastInstance(cfg);
    }
}
