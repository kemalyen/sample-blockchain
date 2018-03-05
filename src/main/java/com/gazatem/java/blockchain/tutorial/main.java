package com.gazatem.java.blockchain.tutorial;

import com.gazatem.java.blockchain.tutorial.model.Block;
import com.gazatem.java.blockchain.tutorial.service.Calculate;

import java.util.ArrayList;

public class main {

    private static Calculate calculate;
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        int difficulty = 1;
        calculate = new Calculate();
        String previousHash = "";
        for(int i = 0; i < 10; i++){
            Block block = new Block("Sample block no: " + i, previousHash);
            block.setHash(calculate.createHash(block));
            calculate.mineBlock(difficulty, block);
            previousHash = block.getPreviousHash();
            blockchain.add(block);
            System.out.println(i +". "+ block.getHash());
        }

        System.out.println("All blocks are hashed...");
    }

}
