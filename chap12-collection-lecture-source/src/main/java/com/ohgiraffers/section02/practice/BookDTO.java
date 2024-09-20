package com.ohgiraffers.section02.practice;

public class BookDTO {
    private int no;
    private String name;
    private String writer;
    private String price;

    public BookDTO() {}

    public BookDTO(int no, String name, String writer, String price) {
        this.no = no;
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPrice() {
        return price;
    }



    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


}
