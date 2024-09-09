package com.ohgiraffers.section01.practice;

import java.util.Random;

public class Prac1 {
    public static void main(String[] args) {

            Random random = new Random();
            Card[] player1Cards = new Card[2];
            Card[] player2Cards = new Card[2];
            Card[] communityCards = new Card[1];
        Card[] communityCards1 = new Card[1];
        Card[] communityCards2 = new Card[1];

            // 플레이어 1 카드 받기
            player1Cards[0] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);
            player1Cards[1] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);

            // 플레이어 2 카드 받기
            player2Cards[0] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);
            player2Cards[1] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);

            // 커뮤니티 카드 받기
            communityCards[0] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);
        communityCards1[0] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);
        communityCards2[0] = new Card(random.nextInt(13) + 1, random.nextInt(4) + 1);

            // 베팅 시작
            System.out.println("플레이어 1 카드: " + player1Cards[0] + ", " + player1Cards[1]);
            System.out.println("플레이어 2 카드: " + player2Cards[0] + ", " + player2Cards[1]);
            System.out.println("커뮤니티 카드: " + communityCards[0] + ", " + communityCards1[0] + ", " +
                            communityCards2[0]);

            // 베팅 진행
            // ...

            // 게임 결과 출력
            // ...
        }
    }

    class Card {
        int suit;
        int value;

        public Card(int value, int suit) {
            this.value = value;
            this.suit = suit;
        }

        @Override
        public String toString() {
            switch (value) {
                case 1:
                    return "Ace";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                case 13:
                    return "King";
                default:
                    return String.valueOf(value);
            }
        }
    }
