package com.practice;

public class Application1 {
    public static void main(String[] args) {

        int min = 10;
        int max = 20;

        RandomMaker rm  = new RandomMaker();

        int result = rm.randomNumber(min, max);
        System.out.println("result : " + result);


    }
}
