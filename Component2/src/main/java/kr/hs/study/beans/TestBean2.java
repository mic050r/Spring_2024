package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    private int data1;
    private double data2;
    @Autowired
    private DataBean3 data3;
    @Autowired
    private DataBean4 data4;

    // autowired 이용해서 11/11.11/주소값1/주소값 2 출력

    public int getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }

    public DataBean3 getData3() {
        return data3;
    }

    public DataBean4 getData4() {
        return data4;
    }
}
