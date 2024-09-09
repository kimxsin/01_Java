package com.ohgiraffers.section01.practice;

public class PApp1 {
    public static void main(String[] args) {



            String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
            String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
            // Math.random() * 범위) + 최솟값;
            int randomShapesIndex = (int)(Math.random() * shapes.length);
            int randomCardNumbersIndex = (int)(Math.random() * cardNumbers.length);

        int randomShapesIndex1 = (int)(Math.random() * shapes.length);
        int randomCardNumbersIndex1 = (int)(Math.random() * cardNumbers.length);

            System.out.println("당신이 뽑은 카드는 " + shapes[randomShapesIndex] + " "
                    + cardNumbers[randomCardNumbersIndex] + " 카드 입니다.");

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapesIndex1] + " "
                + cardNumbers[randomCardNumbersIndex1] + " 카드 입니다.");

        int randomShapesIndex2 = (int)(Math.random() * shapes.length);
        int randomCardNumbersIndex2 = (int)(Math.random() * cardNumbers.length);

        int randomShapesIndex3 = (int)(Math.random() * shapes.length);
        int randomCardNumbersIndex3 = (int)(Math.random() * cardNumbers.length);

        int randomShapesIndex4 = (int)(Math.random() * shapes.length);
        int randomCardNumbersIndex4 = (int)(Math.random() * cardNumbers.length);

        System.out.println("==============================================================================");

        System.out.println("테이블에 깔린 카드는 " + shapes[randomShapesIndex2] + " "
                + cardNumbers[randomCardNumbersIndex2] + " 카드 입니다.");
        System.out.println("테이블에 깔린 카드는 " + shapes[randomShapesIndex3] + " "
                + cardNumbers[randomCardNumbersIndex3] + " 카드 입니다.");
        System.out.println("테이블에 깔린 카드는 " + shapes[randomShapesIndex4] + " "
                + cardNumbers[randomCardNumbersIndex4] + " 카드 입니다.");
        System.out.println("==============================================================================");


    }


}
