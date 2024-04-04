package kr.hs.study;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.obj_Person;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        obj_Person obj1 = ctx.getBean("objP", obj_Person.class);
        obj1.proData();

        ctx.close();
    }
}