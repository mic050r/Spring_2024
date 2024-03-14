package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // config.xml을 읽어서 객체 만들고 보관한다.
        // 강합 경합
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        // 다향성(인터페이스 상속) , 약한 결합
        //  ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        // obj1에는 TestBean의 주소
//        TestBean obj1 = ctx.getBean(TestBean.class);
//        System.out.println("obj1 : " + obj1);
//        System.out.println("=========================");

        // 기본 생성자 1번 출력 , 똑같은 주소 출력
        // 객체를 다시 생성해도 똑같은게 가져와짐 => 싱글폼
//        TestBean obj2 = ctx.getBean(TestBean.class);
//        System.out.println("obj2 : " + obj2);

//
//        System.out.println("=========================");
//
//        TestBean obj3 = ctx.getBean("t3", TestBean.class);
//        System.out.println("obj3 : " + obj3);
        /*
         No qualifying bean of type 'kr.hs.study.beans.TestBean' available:
         expected single matching bean but found 2: kr.hs.study.beans.TestBean#0,t3
         똑같은 클래스 객체를 생성해서 오류가 발생
         */

//        TestBean obj4 = ctx.getBean("t4", TestBean.class);
//        System.out.println("obj4 : " + obj4);

        TestBean obj5 = ctx.getBean("t5", TestBean.class);
        System.out.println("obj5 : " + obj5);

        // t5 객체가지고 와서 obj6에 넣고 출력
        TestBean obj6 = ctx.getBean("t5", TestBean.class);
        System.out.println("obj6 : " + obj6);

        ctx.close();
    }
}