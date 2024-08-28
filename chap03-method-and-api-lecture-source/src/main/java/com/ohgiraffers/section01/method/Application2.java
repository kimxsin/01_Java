package com.ohgiraffers.section01.method;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {
        /*다른 흐름의 메소드 호출에 대해 이해할 수 있다.
        * 1. methodA() , methodB() , methodC() 차례로 작성
        * 2. 장성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성
        * 3. 메인 메소드 실행 종료를 확인하기 위한 출력 구문을 작성
        * */
        System.out.println("main() 시작됨...");
        //4. methodA(), methodB(), methodC() 호출을 해보자
        // 클래스명 변수명 = new 클래스명();
        // 변수명.메소드명();

        Application2 app2 = new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨...");

    }
    public void methodA() {
        System.out.println("methodA 호출됨...");
        System.out.println("methodA 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB 호출됨...");
        System.out.println("methodB 종료됨...");
    }
    public void methodC() {
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 종료됨...");


    }




}
