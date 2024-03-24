package kr.hs.study;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.BasketBall;
import kr.hs.study.beans.Soccer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        BasketBall basketBall =ctx.getBean("basketball", BasketBall.class);
        BaseBall baseBall =ctx.getBean("baseball", BaseBall.class);
        Soccer soccer =ctx.getBean("soccer", Soccer.class);

        baseBall.play();
        baseBall.rule();
        System.out.println("=========");
        basketBall.play();
        baseBall.rule();
        System.out.println("=========");
        soccer.play();
        soccer.rule();
    }
}