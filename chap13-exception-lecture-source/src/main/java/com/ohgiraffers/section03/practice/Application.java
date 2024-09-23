package com.ohgiraffers.section03.practice;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("연산자를 입력하세요 : (+, -, *, /) : ");
        String operator = sc.next();

        try {
            int result = cal.calculate(num1, num2, operator);
            System.out.println("결과: " + result);
        } catch (DivideNotZeroException e) {
            System.out.println(e.getMessage());

        } catch (MultipleNotZeroException e) {
            System.out.println(e.getMessage());

        } catch (XException e) {
            throw new RuntimeException(e);

        } finally {
            System.out.println("계산 끝");
        }
    }

}
