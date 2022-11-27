package com.hazelcast.service;

import com.google.inject.Inject;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

public class HazelcastService {
    @Inject
    private HazelcastInstance hz;

    public void checkHazelDataStructure(){
        Map<Integer, String> custMap = hz.getMap("customers");
        custMap.put(1, "Joe");
        custMap.put(2, "Ali");
        custMap.put(3, "Avi");

        Queue<String> custQue = hz.getQueue("customers");
        custQue.offer("Tom");
        custQue.offer("Mary");
        custQue.offer("Jane");
    }
}
