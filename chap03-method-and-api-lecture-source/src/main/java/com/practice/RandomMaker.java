package com.practice;

import java.util.Random;

public class RandomMaker {
    public int randomNumber(int min,int max){

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;

    }
}
