package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {
            BookMenu bookService = new BookMenu();
            BookDTO book = bookService.createBook();
            System.out.println("생성된 책 정보: " + book);

    }
    }

