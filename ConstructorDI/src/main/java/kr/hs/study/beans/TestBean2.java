package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 d2; // d2가 dd를 가리킴

    public TestBean2(DataBean2 d2) {
        this.d2 = d2;
    }

    public void prData2() {
        System.out.println("d2 : " + d2);
    }
}
