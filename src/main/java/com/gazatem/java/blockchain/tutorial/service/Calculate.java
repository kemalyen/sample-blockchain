package com.gazatem.java.blockchain.tutorial.service;

import com.gazatem.java.blockchain.tutorial.model.Block;
import com.gazatem.java.blockchain.tutorial.utils.StringUtil;

public class Calculate {

     public String createHash(Block block) {

        String calculatedhash = StringUtil.applySha256(
                block.getPreviousHash() +
                        Long.toString(block.getTimeStamp()) +
                        Integer.toString(block.getNonce()) +
                        block.getStoredData()
        );
        return calculatedhash;
    }

    public Block mineBlock(int difficulty, Block block) {
        String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0"
        String hash = block.getHash();
        int nonce = 0;
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            block.setNonce(nonce);
            hash =  this.createHash(block);
        }
        block.setHash(hash);
        return block;
    }

}
