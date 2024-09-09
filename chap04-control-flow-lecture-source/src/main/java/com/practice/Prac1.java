package com.practice;

import java.util.Scanner;

public class Prac1 {
    public void Practice1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요 ? : ");
        int num = sc.nextInt();

        if(num >= 20) {
            System.out.println("판매가능합니다.");
        }
        System.out.println("판매 불가합니다 음료 코너에서 골라주세요");
    }

}
