package kr.hs.study.beans;

public class BasketBall implements Sports{
    @Override
    public void play() {
        System.out.println("농구 빵빵");
    }

    @Override
    public void rule() {
        System.out.println("손만을 이용해서 공을 주고받는다.");
    }
}
