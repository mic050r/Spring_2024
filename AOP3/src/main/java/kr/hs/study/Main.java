package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj = ctx.getBean(TestBean1.class);
        TestBean2 obj2 = ctx.getBean(TestBean2.class);
        obj.method1();
        obj.method2();
        obj.method3();
        obj2.method1();

        ctx.close();
    }
}