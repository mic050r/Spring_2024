package kr.hs.study;

import kr.hs.study.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx=
                new ClassPathXmlApplicationContext("config.xml");

        Person p = new Person();


        ctx.close();
    }
}