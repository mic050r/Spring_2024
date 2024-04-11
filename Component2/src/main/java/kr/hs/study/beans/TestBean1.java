package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component("t1")
public class TestBean1 {
    @Autowired
    @Qualifier("java2")
    private DataBean1 data1;

    public DataBean1 getData1() {
        return data1;
    }

}
