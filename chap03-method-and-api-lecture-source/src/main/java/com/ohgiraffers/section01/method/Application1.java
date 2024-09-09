package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
//        /*메소드의 호출 흐름에 대해 이해할 수 있다.
//        * 메소드 란?
//        * 메소드(method) 는 어떤 특정 작업을 수행하기 위한
//        * 명령문(코드)의 집합.
//        *
//        * */
//
//        System.out.println("main() 시작됨...");
//
//
//        // main 영역 밖에 있는 친구를 소환할 때 쓰는 구문
//        Application1 app1 = new Application1();
//        app1.methodA();
//
//        System.out.println("main() 종료됨...");
//
//
//
//
//
//
//
//
//    }
//
//
//    /*1. method() 만들어보기 */
//
//    public void methodA() {
//
//
//
//        System.out.println("methodA() 등장...");
//
//        methodB();
//
//        System.out.println("methodA() 퇴장...");
//        //2. 작성한 methodA() 호출하기.
//
//        //우리가 만든 메소드 호출하는 방법
//        //표현식
//        //클래스명 변수명 = new 클래스명();
//        //변수명.메소드명();
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//    public void methodB() {
//        //3. methodB() 만들어보기
//
//        System.out.println("methodB 두등장...");
//        System.out.println("methodB 퇴장한다...");
//
//
//    }

        int first = 10;
        int second = 5;

         Calculator.plusTwoNumbers(first, second);

       // Application7 app7 = new Application7();
       // app7.plusTwoNumbers(first, second);


        System.out.println("10과 20의 합 : " + Calculator.plusTwoNumbers(first, second));
        System.out.println("10과 5의 차 : " + Calculator.minusTwoNumbers(first, second));
        System.out.println("10과 5의 곱 : " + Calculator.multipleTwoNumbers(first, second));
        System.out.println("10과 5의 나눈 후 몫 : " + Calculator.divideTwoNumbers(first, second));


    }


    }
