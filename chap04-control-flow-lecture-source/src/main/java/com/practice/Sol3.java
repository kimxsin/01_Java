package com.practice;

import java.util.Random;
import java.util.Scanner;

public class Sol3 {
    public void Solution3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요?");
        int random = (int) (Math.random() * 10) + 1;

        int num = sc.nextInt();
        if (num <= 10 && num >= 1) {
            if ((num) % 2 == 0) {
                System.out.print("짝수네요, 모자 선물입니다!! ");
            } else if ((num) % 2 != 0) {
                System.out.print("홀수네요, 인형 선물입니다!! ");
            }} else {
                System.out.print("당첨 번호는 1 ~ 10 사이에만 있어요 ");
            }
        }
    }


