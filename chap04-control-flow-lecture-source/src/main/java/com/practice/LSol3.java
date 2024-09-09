package com.practice;

import java.util.Scanner;

public class LSol3 {
    public void LSol13(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("1 부터 10 사이의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 1 && num <= 10 ) {
            for (int i = 1; i <= num; i++) {
                sum += i;
                if (i % 2 == 0 && num % 2 == 0) {


                }
                System.out.println("1 부터 " + num + " 까지 짝수의 합 : " + sum);
            }


        }else{
            System.out.println("제대로 입력하세요");
        }



    }
}
