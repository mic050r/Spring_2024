package kr.hs.study.beans;

public class Soccer implements Sports{
    @Override
    public void play() {
        System.out.println("축구 통통");
    }

    @Override
    public void rule() {
        System.out.println("상대팀의 골대 안에 공을 발로 차서 넣는다.");
    }
}
