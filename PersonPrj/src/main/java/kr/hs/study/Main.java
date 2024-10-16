package kr.hs.study;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.obj_Person;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println(obj1);
        
        ctx.close();
    }
}