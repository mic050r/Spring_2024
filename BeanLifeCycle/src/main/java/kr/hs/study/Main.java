package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1" + obj1);

//      ctx.close() 주석 처리하고 실행하면 destroy method 안뜸 = 객체 소멸이 안돼서
        ctx.close();
    }
}