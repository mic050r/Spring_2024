package kr.hs.study.beans;

public class TestBean1 {
    private final int data1;
    private final double data2;
    private final String data3;


    public TestBean1() {
        // 11, 11.11 Jane11 출력
        this.data1 = 11;
        this.data2 = 11.11;
        this.data3 = "Jane11";
    }

    // 메소드 오버로딩
    public TestBean1(int data1) {
        System.out.println("int 하나 받는 생성자");
        this.data1 = data1;
        this.data2 = 22.22;
        this.data3 = "Jane22";
    }

    public TestBean1(double data2) {
        System.out.println("double 하나 받는 생성자");
        this.data1 = 33;
        this.data2 = data2;
        this.data3 = "Jane33";
    }

    public TestBean1(String data3) {
        System.out.println("String 하나 받는 생성자");
        this.data1 = 55;
        this.data2 = 55.55;
        this.data3 = data3;
    }

    public TestBean1(int data1, double data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void prData() {
        // 여기서 data1, data2, data3 출력
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }

}
