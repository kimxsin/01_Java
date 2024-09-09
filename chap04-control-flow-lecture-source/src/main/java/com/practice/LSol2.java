package com.practice;

import java.util.Scanner;

public class LSol2 {
    public void LSol12(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 10 사이의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;
        if(num >= 1 && num <= 10 ){
            for(int i = 1; i <= num; i++){
                sum += i;
            }
            System.out.println("1 부터 " + num + " 까지의 합 : " + sum);

        }else{
            System.out.println("다시 입력해주세요");


        }





    }
}
