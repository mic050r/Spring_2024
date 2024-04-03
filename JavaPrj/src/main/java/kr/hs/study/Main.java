package kr.hs.study;

import kr.hs.study.beans.*;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Java : BeanConfigClass 설정파일을 읽어서 객체를 생성하고 컨테이너에 보관한다.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);

        System.out.println("obj1 : " + obj1);

//        System.out.println("==================");
//        TestBean2 obj2 = ctx.getBean("java2", TestBean2.class);
//
//        System.out.println("obj2 : " + obj2);

        System.out.println("==================");
        TestBean2 obj3 = ctx.getBean("mike", TestBean2.class);

        System.out.println("obj3 : " + obj3);

        System.out.println("==================");
//        TestBean3 obj4 = ctx2.getBean("t1", TestBean3.class);
//        System.out.println("obj4 : " + obj4);

        System.out.println("==================");
        TestBean3 obj5 = ctx.getBean("a3", TestBean3.class);
        System.out.println("obj5 : " + obj5);

        System.out.println("==================");
        TestBean4 obj6 = ctx.getBean(TestBean4.class);
        System.out.println("obj6 : " + obj6);

        System.out.println("==================");
        TestBean5 obj7 = ctx.getBean("java6", TestBean5.class);
        System.out.println("obj7 : " + obj7);

        ctx.close();
    }
}