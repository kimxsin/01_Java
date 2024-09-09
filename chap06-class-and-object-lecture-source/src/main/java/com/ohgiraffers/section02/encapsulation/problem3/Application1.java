package com.ohgiraffers.section02.encapsulation.problem3;

public class Application1 {
    public static void main(String[] args) {
        /*필드에 직접 접근 시 발생하는 문제(3)
        * */
        //여기서는 problem1 을 적용 -> 메소드를 통해 값 입력
        Monster monster1 = new Monster();
        monster1.setName("하츄핑");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setName("시진핑");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setName("타니핑");
        monster3.setHp(300);

        Monster monster4 = new Monster();
        monster4.setName("핑");
        monster4.setHp(400);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        //뭔가 해결된 것 같지만 아직 해결되지 않은 게 있다.
        Monster monster5 = new Monster();
        monster5.Kinds = "";
        monster5.hp = -131213131;
        // 아직도 필드에 직접 값을 넣을 수 있다.


    }
}
