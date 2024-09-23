package com.ohgiraffers.practice;

import java.util.Scanner;

public class BookMenu {
    public BookDTO createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("책 제목을 입력하세요: ");
        String title = scanner.nextLine();

        System.out.print("저자를 입력하세요: ");
        String author = scanner.nextLine();

        System.out.print("가격을 입력하세요: ");
        double price = scanner.nextDouble();

        System.out.println("카테고리를 선택하세요: ");
        System.out.println("1. 인문");
        System.out.println("2. 자연과학");
        System.out.println("3. 의료");
        System.out.println("4. 기타");
        int categoryChoice = scanner.nextInt();

        String category = "";
        switch (categoryChoice) {
            case 1: category = "인문"; break;
            case 2: category = "자연과학"; break;
            case 3: category = "의료"; break;
            case 4: category = "기타"; break;
            default: System.out.println("잘못된 선택입니다. '기타'로 설정됩니다.");
                category = "기타";
        }

        BookDTO book = new BookDTO(title, author, price, category);
        return book;
    }
}




