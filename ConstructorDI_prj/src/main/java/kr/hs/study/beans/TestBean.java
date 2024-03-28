package kr.hs.study.beans;

public class TestBean {
    int data1;
    double data2;
    DataBean data3;
    DataBean data4;

    public TestBean(int data1, double data2, DataBean data3, DataBean data4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    public void prData() {
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}

