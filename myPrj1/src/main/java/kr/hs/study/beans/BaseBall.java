package kr.hs.study.beans;

public class BaseBall implements Sports {
    @Override
    public void play() {
        System.out.println("야구 깡깡");
    }

    @Override
    public void rule() {
        System.out.println("투수가 공을 던지고, 타자가 공을 친다.");
    }
}
