package com.ohgiraffers.section03.practice;

public class Calculator {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multipl(int a, int b) throws MultipleNotZeroException {
        if (b == 0) {
            throw new MultipleNotZeroException();
        }
        return a * b;
    }

    public int divide(int a, int b) throws DivideNotZeroException {
        if (b == 0) {
            throw new DivideNotZeroException();
        }
        return a / b;
    }

    public int calculate(int a, int b, String operator) throws DivideNotZeroException, MultipleNotZeroException, XException {
        switch (operator) {
            case "+":
                return plus(a, b);
            case "-":
                return minus(a, b);
            case "*":
                return multipl(a, b);
            case "/":
                return divide(a, b);
            default:
                throw new XException();
        }
    }
}

