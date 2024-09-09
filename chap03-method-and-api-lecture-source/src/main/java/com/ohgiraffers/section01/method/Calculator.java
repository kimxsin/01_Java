package com.ohgiraffers.section01.method;

public class Calculator {
//    /*우리는 Applicatoin 에서 2개의 정수를 전달 할 것이고
//    * Calculator 클래스는 2개의 정수를 전달 받아
//    * 최솟값을 구하는 메소드(기능)
//    * 최댓값을 구하는 메소드(기능)
//    * 실행 후 Application 에게 2개의 정수 중 큰 값과 작은 값이
//    * 무엇인 지 알려 줄 것이다.
//    *
//    * */
//
    public int minNumberOf(int first, int second) {
        return (first <= second) ? first : second;

    }
//
public static int maxNumberOf(int first1, int second1) {
        return (first1 > second1) ? first1 : second1;
//}
//public void checkmethod(){

};

    public static int plusTwoNumbers(int first, int second) {
        //  System.out.println("first = " + first);
        //  System.out.println("second = " + second);
        return first + (second * 4);
    }

    public static int minusTwoNumbers(int first, int second) {
        return first - second;

    }

    public static int multipleTwoNumbers(int first, int second) {
        return first * second;

    }

    public static int divideTwoNumbers(int first, int second) {
        return first / second;

    }
}





/* 다음 조건을 만족하는 프로그램을 작성하시오.
 *   구현 클래스 Calculator, Application01
 *   구현 내용
 *   Calculator
 *   - checkMethod(): void 설명 : 함수 호출, 확인용 메소드
 *   - sumTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 합을 리턴한다.
 *   - minusTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 차를 리턴한다.
 *   - multiTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 곱한 값을 리턴한다.
 *   - divideTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 나눈 값을 리턴한다.
 *
 *   Application01
 *   - main(args:String[]): void 설명 : 모든 메소드는 main 함수에서 호출하여 출력한다.
 *   // 메소드 호출 확인용 메소드 호출
 *   // 10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
 *   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
 *   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 곱을 구하는 메소드 호출 후 리턴값 출력
 *   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 몫을 구하는 메소드 호출 후 리턴값 출력
 *   실행 결과
 *   - 메소트 호출 확인
 *   - 10과 20의 합 : 30
 *   - 10과 5의 차 : 5
 *   - 10과 5의 곱 : 50
 *   - 10과 5의 나눈 후 몫 : 2
 *  */