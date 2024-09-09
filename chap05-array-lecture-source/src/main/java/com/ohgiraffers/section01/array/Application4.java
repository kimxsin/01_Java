package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 문제 5명의 자바 점수를 정수로 입력받아서
        * 합계와 평균을 실수로 구하는 프로그램 제작
        * */
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        for(int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 쨰 학생의 자바 점수를 입력 해주세요 : ");
            scores[i] = sc.nextInt();
        }
        //결과를 담을 변수 선언
        double sum = 0.0;
        double avg = 0.0;

        // 합계는 모든 배열의 인덱스 공간에 들어있는 값을 더해주면 된다.
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
            //평균은 합계를 구한 값에서 배열의 길이만큼 나눠준다,
            avg = sum / scores.length;


        }
        System.out.println("5명 점수의 합계 : " + sum);
        System.out.println("5명 점수의 평균 : " + avg);

    }
}
