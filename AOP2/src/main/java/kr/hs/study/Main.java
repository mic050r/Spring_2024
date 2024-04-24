package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);

        kr.hs.study.beans2.TestBean1 obj2 = ctx.getBean("t2", kr.hs.study.beans2.TestBean1.class);

        obj1.method1();
        obj1.method2();
        obj1.method3();

        obj2.method1();


        ctx.close();
    }
}