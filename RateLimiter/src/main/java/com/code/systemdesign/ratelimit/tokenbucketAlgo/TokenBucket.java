package com.code.systemdesign.ratelimit.tokenbucketAlgo;

public class TokenBucket {
    public static void main(String args[]){
        Bucket b = new Bucket(10);
        Thread tokens = new AddTokenThread(b);
        Thread packets = new AddPacketThread(b);
        try{
            tokens.start();
            packets.start();
        }
        catch(Exception e){}
    }
}
