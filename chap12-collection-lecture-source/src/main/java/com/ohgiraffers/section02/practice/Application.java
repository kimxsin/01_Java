package com.ohgiraffers.section02.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("책 번호를 입력해 주세요 : ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("책 제목을 입력해 주세요 : ");
        String b = sc.nextLine();

        System.out.print("책 저자를 입력해 주세요 : ");
        String c = sc.nextLine();

        System.out.print("책 가격을 입력해 주세요 : ");
        String d = sc.nextLine();


        ArrayList<BookDTO> books = new ArrayList<>();
        books.add(new BookDTO(1, "개구리왕자", "경구리", "20000원"));
        books.add(new BookDTO(2, "올챙이왕자", "올구리", "12000원"));
        books.add(new BookDTO(3, "두더지왕자", "두구리", "18000원"));
        books.add(new BookDTO(4, "강아지왕자", "강구리", "15000원"));
        books.add(2,new BookDTO(a, b, c, d));

        System.out.println(books.size());
        for(int i = 0; i < books.size(); i++) {
            System.out.println(i + "번 째 값 : " + books.get(i));
        }
        for(BookDTO s : books) {
            System.out.println(s);
        }

    }
}
