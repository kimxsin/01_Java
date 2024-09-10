package com.ohgiraffers.section02.use;

public class MemberManager {
    /*사용자에게 회원등록, 회원조회 요청을 받게 되면
    * 1. 등록 관련 클래스에게 명령
    * 2. 조회 관련 클래스에게 명령
    * */

    public void signUpMembers() {
        MemberDTO[] members = new MemberDTO[5];
        members[0] = new MemberDTO(1, "user01", "passo1", "푸바오", 4, '여');
        members[1] = new MemberDTO(2, "user02", "passo2", "아이바오", 7, '남');
        members[2] = new MemberDTO(3, "user03", "passo3", "리바오", 3, '여');
        members[3] = new MemberDTO(4, "user04", "passo4", "후이바오", 2, '남');
        members[4] = new MemberDTO(5, "user05", "passo5", "밤바오", 1, '남');
        //회원 등록에 특화된 직원
        MemberInsertManager insertManager = new MemberInsertManager();
        insertManager.insert(members);
    }

    public void searchAllMember() {
        MemberSearchManager searchManager = new MemberSearchManager();
        MemberDTO[] result = searchManager.searchAllMembers();
        System.out.println("================가입 된 푸바오 패밀리=============");
        for(MemberDTO member : result) {
            System.out.println(member.toString());
        }
        System.out.println("==============================================");
        System.out.println("총 " + result.length + "명의 회원이 가입 되어 있습니다!!!!");
    }
}
