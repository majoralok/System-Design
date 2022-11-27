package com.code.systemdesign.ratelimit.tokenbucketAlgo;

public class AddTokenThread extends Thread {
    Bucket b;

    AddTokenThread(Bucket b) {
        this.b = b;
    }

    public void run() {
        while (true) {
            b.addToken(1);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
    }
}
