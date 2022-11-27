package com.code.systemdesign.ratelimit.tokenbucketAlgo;

public class AddPacketThread extends Thread {
    Bucket b;

    AddPacketThread(Bucket b) {
        this.b = b;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(500 + (int) (Math.random() * 3000));
            } catch (Exception e) {
            }
            b.sendPacket(1 + (int) (Math.random() * 9));
        }
    }
}
