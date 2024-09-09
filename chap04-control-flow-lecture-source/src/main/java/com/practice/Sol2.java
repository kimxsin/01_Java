package com.practice;

import java.util.Scanner;

public class Sol2 {

    public void Solution2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("홀 짝 그 결과는? : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("짝수입니다!");
        } else {
            System.out.println("홀수입니다!");
        }
    }
}
