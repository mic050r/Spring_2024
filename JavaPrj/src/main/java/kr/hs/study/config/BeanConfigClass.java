package kr.hs.study.config;

import kr.hs.study.beans.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
//@Lazy
//@Scope("prototype")
public class BeanConfigClass {
    // config.xml하고 같은 예이다. 설정 파일이다.
    // 메소드 이름이 객체 이름
    @Bean
    // 메소드로 객체 생성
    public TestBean1 java1() {
        TestBean1 t = new TestBean1();
        return t;
    }

    @Bean(name = "mike")
    public TestBean2 java2() {
        TestBean2 t = new TestBean2();
        return t;
    }

    @Bean(name = "a3")
//    @Lazy
    @Scope("prototype")
    public TestBean3 java3() {
        TestBean3 t = new TestBean3();
        return t;
        // return new TestBean3()
    }

    @Bean
    public TestBean4 java4() {
        return new TestBean4();
    }

    @Bean
    @Primary // 똑같은 클래스가 여러개 일 때 우선 순위 정하기
    public TestBean4 java5() {
        return new TestBean4();
    }

    @Bean
    public TestBean5 java6() { return new TestBean5(); }

    @Bean
    @Primary
    public TestBean5 java7() { return new TestBean5(); }
}



