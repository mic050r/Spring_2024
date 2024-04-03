package kr.hs.study.confing;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class BeanConfigClass {

//    SetterDI
    @Bean
    @Primary
    public TestBean1 java1() {
        TestBean1 t6 = new TestBean1();
        t6.setData1(77);
        t6.setData2(77.77);
        t6.setData3(new DataBean1());

        return t6;
    }

//    Constructor
    @Bean
    public TestBean1 java2()  {
        TestBean1 t5 = new TestBean1(66, 66.66, new DataBean1());
        return t5;
    }
}
