package kr.hs.study;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrMsg;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        IPrintMsg obj1 = ctx.getBean(IPrintMsg.class);

        obj1.sayHello1();
        obj1.sayHello2();

        ctx.close();
    }
}