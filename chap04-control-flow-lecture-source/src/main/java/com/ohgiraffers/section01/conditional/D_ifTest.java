package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_ifTest {

    public void testIfElseTest() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("너는 몸무게가 몇 kg 이야? : ");
        if (num >= 70) {
            System.out.println("샐러드나 먹어라");
        } else if (num < 70){
            System.out.println("치킨을 먹어도 된다 ");
        } else {
            System.out.println("치킨집 문이 닫았으니 라면이나 먹어라");
        }
    }
}
