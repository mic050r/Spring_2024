package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj = ctx.getBean("t1", TestBean1.class);
        System.out.println(obj.getData1());
        System.out.println(obj.getData2());
        System.out.println(obj.isData3());
        System.out.println(obj.getData4());

        System.out.println("===============");
        TestBean2 obj2 = ctx.getBean("t2",TestBean2.class);
        System.out.println(obj2.getData1());
        System.out.println(obj2.getData2());

        ();
    }
}