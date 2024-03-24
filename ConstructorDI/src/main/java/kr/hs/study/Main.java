package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 자바로 객체로 만들어서 출력(스프링으로 만드는거 아님)
        // 11, 11.11 , Jane11
        TestBean1 testBean1 = new TestBean1();
        testBean1.prData();

        System.out.println("===========");

        // 66. 66.66, Jane66
        TestBean1 testBean2 = new TestBean1(66, 66.66, "Jane66");
        testBean2.prData();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        // 22, 22.22 , Jane22
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();

        System.out.println("===========");

        // 33, 33.33 , Jane33
        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        obj2.prData();

        System.out.println("===========");

        // 55, 55.55 , Jane55
        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        obj3.prData();

        System.out.println("===========");

        // 66, 66.66 , Jane66
        TestBean1 obj4 = ctx.getBean("t5", TestBean1.class);
        obj4.prData();

        System.out.println("===========");

        TestBean2 obj5 = ctx.getBean("t6", TestBean2.class);
        System.out.println(obj5);


        ctx.close();

    }
}