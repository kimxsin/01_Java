package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {

        /*논리연결연산자의 진리표에 대해 이해할 수 있다
        and 연산과 or 연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행조차 안 한다!!!
        * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행조차 안 한다!!!!
        *
        1. 논리 && 논리 : 앞의 결과가 false 일 때 뒤의 식 동작 확인
        */

        //앞의 조건을 의도적으로 false 로 강제화를 해두고 뒤의 조건은 ++로 num1 의 값을 1 증가 시키는 코드를 작성했다
        //그래서 만약에 ++num1 동작을 했다면 ,result 출력 했을 때 11이 나와야한다 반대로 true 자리에 false를 넣으면 뒤에 조건은
        // 계산하지않고 무시해서 10이 나온다
        int num1 = 10;
        int result = (true && ++num1 > 0) ? num1 : num1;
        System.out.println("&& 실행 확인해보기 : " + result);

        // &&의 조건식 두 개가 모두 만족을 해야 true를 반환을 하는데
        //첫 번째 조건식에서 false가 나오게 되면 뒤에 조건은 확인하지않는다
        //따라서 컴퓨터가 일을 적게 하게 만들려면 -> 속도 향상 false 나올 확률이 높은 조건을 앞에 두면 좋다.


        //2. 논리 || 논리 : 앞의 결과가 true 이면 뒤를 실행 안 함.
        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;

        System.out.println("|| 연산 실행 확인 : " + result2);











    }
}
