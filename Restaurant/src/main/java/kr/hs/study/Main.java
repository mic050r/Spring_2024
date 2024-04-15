package kr.hs.study;

import kr.hs.study.beans.Order;
import kr.hs.study.beans.Restaurant;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        Restaurant obj1 = ctx.getBean(Restaurant.class);

        obj1.proData();
        ctx.close();
    }
}