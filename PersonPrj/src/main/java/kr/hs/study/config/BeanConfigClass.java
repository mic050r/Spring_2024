package kr.hs.study.config;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.obj_Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class BeanConfigClass {

    @Bean
    public obj_Person objP() {
        Person p1 = new Person("kim", 30, "seoul");
        Person p2 = new Person("lee", 25, "busan");
        obj_Person p = new obj_Person(11, "usa", p1, p2);
        return p;
    }
}
