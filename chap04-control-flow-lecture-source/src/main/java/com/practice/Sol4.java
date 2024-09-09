package com.practice;

import java.util.Scanner;

public class Sol4 {
    public void Solution4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력해주세요");
        double height = sc.nextDouble();
        System.out.print("몸무게를 입력해주세요");
        double weight = sc.nextDouble();



        double bmi = weight / (height * 2);

        if(bmi < 20){
            System.out.print("저체중입니다. 축제 음식을 왕창 드세요!");
        }else if(bmi >= 20 && bmi < 25){
            System.out.print("정상 체중입니다. 축제 재미있게 즐기세요~");
        }else if(bmi >= 25 && bmi < 30){
            System.out.print("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        }else if(bmi > 30){
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }




    }
}
