package kr.hs.study.beans;

public class PrMsg implements IPrintMsg{
    @Override
    public void sayHello1() {
        System.out.println("sayHello1 출력");
    }

    @Override
    public void sayHello2() {
        System.out.println("sayHello2 출력");

    }
}
