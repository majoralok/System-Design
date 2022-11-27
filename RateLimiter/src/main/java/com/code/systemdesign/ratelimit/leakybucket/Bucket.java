package com.code.systemdesign.ratelimit.leakybucket;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 1. An interface containing a leaky bucket is connect each host to the network that is a finite internal queue.
 * 2. When space is available in a queue, a packet will send from an application in store.
 * 3. When the queue is full and a new packet will send from an application is discarded.
 * 4. The host operating system builds or simulate this arrangement in the hardware.
 * 5. The packets are queuing and releasing at regular intervals with the regular amount and that reduces the chances of congestion.
 *
 * Problem: As the packets carry an uneven amount of data, The packets on the network is generates the actual loading effect that is also uneven.
 *
 * 1. At every clock tick, a counter is initialise to a value n.
 * 2. When the first packet in the queue –
 * if length < n then transmitter counter = n – length of the first packet
 * 3. When additional packets are in the queue – sent along with the first packet if total length<n
 * 4. For the first packet-
 * if length = n then transmitted
 * No other packet can be transmitted till next clock tick.
 * 5. In the next clock, the tick counter is initialised to n.
 */
public class Bucket {
    Queue<Integer> leakyBucket = new LinkedList<>();
    Map<String, Queue> bucketHolder = new HashMap<>();
}
