package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println(obj1);

        TestBean2 obj2 = ctx.getBean(TestBean2.class);
        ctx.close();
    }
}