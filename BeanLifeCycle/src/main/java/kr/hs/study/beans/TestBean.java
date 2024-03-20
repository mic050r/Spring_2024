package kr.hs.study.beans;

public class TestBean {
    public TestBean() {
        System.out.println("TestBean1의 기본 생성자");
    }

    public void initMethod() {
        System.out.println("생성자 이후 자동으로 실행되는 메소드");
    }
}
