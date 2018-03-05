package com.gazatem.java.blockchain.tutorial.model;

import java.util.Date;

public class Block {
    private String hash;
    private String previousHash;
    private String storedData;
    private long timeStamp;
    private int nonce;

    public Block(String storedData,String previousHash ) {
        this.storedData = storedData;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getStoredData() {
        return storedData;
    }

    public long getTimeStamp() {
        return timeStamp;
    }


    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }
}
