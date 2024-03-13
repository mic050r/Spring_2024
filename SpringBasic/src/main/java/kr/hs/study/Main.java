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
        TestBean obj1 = ctx.getBean(TestBean.class);
        System.out.println("obj1 : " + obj1);

        ctx.close();
    }
}