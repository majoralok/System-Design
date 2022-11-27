package com.hazelcast;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.module.HazelcastModule;
import com.hazelcast.service.HazelcastService;

import java.util.Map;
import java.util.Queue;


public class HazelcastStarted {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HazelcastModule());
        HazelcastService hazelcastService = injector.getInstance(HazelcastService.class);
        HazelcastInstance hz = injector.getInstance(HazelcastInstance.class);

        hazelcastService.checkHazelDataStructure();
        Map<Integer, String> custMap = hz.getMap("customers");

        System.out.println("Customer with Key 1:"+ custMap.get(1));
        System.out.println("Map Size: "+ custMap.size());

        Queue<String> custQue = hz.getQueue("customers");

        System.out.println("First Customer: "+ custQue.poll());
        System.out.println("Second Customer: "+ custQue.peek());
        System.out.println("Queue Size: "+ custQue.size());
    }
}
