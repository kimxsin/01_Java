package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /*증간연산자에 대해 이해할 수 있다.
        * 증강 연산자
        * 피연산자 앞 or 뒤에 사용이 가능하다.
        * '++' : 1 증가
        * '--' : 1 감소
        * */

        // 1. 증강연산자를 단항으로만 사용
        // 단항으로 사용 될 때는 1증가, 1 감소의 의미

        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);
        --num;
        System.out.println("num = " + num);

        //2. 증강연산자를 다른 연산자와 함께 사용
        //주의사항
        // ++와 --같이 증강연산자는 다른 연산자와 함께 사용할 떄 의미가 달라진다.
        // 다른 연산자와 함께 사용할 떄 증강 연산자의 의미
        // '++num' : 피연산자의 같은 갚을 먼저 1 증가시킨 후 다른 연산 진행
        // 'num++ : 다른 연산을 먼저 진행한 후 마지막에 피연산자 값을 1 증가


        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);


        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("result2 = " + result2);
        System.out.println("secondNum  = " + secondNum);

        int thirdNum = 20;
        int result3 = ++thirdNum;
        System.out.println("result3 = " + result3);
        System.out.println("thirdNum = " + thirdNum);



// 번외
        int a = 11;
        int b = -5;
        int c = (a++) - b--;
        int d = ++c + a--;

        System.out.println("a : " + a );
        System.out.println("b : " + b );
        System.out.println("c : " + c );
        System.out.println("d : " + d );

























    }
}
