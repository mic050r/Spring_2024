package kr.hs.study.config;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.obj_Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans"})
public class BeanConfigClass {

}
