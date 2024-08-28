package com.ohgiraffers.section05.logical;

public class Applicatoin2 {
    public static void main(String[] args) {

        /*논리연산자의 우선순위에 대해 이해하고 활용해보자.
        *논리 연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11 순위
        * || : 12 순위
        * 1. 1 부터 100 사이의 값인지 확인
        *  */

        int num1 = 160;

        System.out.println("num1 이 1부터 100 사이인 지 확인 : " + (1 <= num1 && num1 <= 100));

        /*2. 영어 대문자인지 확인*/

        char ch1 = 'G';

        System.out.println("ch1 이 영어 대문자인지 확인 : " + ('A' <= ch1 && ch1 <= 'Z'));

        char aTest = 'a';
        char ATest = 'A';

        int aToInt = aTest;
        int ATOInt = ATest;

        System.out.println("aToInt = " + aToInt);
        System.out.println("ATOInt = " + ATOInt);

        //3, 'f' 대소문자 상관 없이 영어인지 확인해보기

       char ch2 = 'f';
        System.out.println("f 가 영문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z' || ch2 >= 'a' && ch2 <= 'z'));























    }
}
