package kr.hs.study.config;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
// kr.hs.study.beans 패키지 밑에 있는 어노테이션을 분석해서 객체를 만들고 컨테이너에 보관해라
public class BeanConfigClass {

    @Bean
    public DataBean1 java1() {
        return new DataBean1();
    }

    @Bean
    public DataBean1 java2() {
        return new DataBean1();
    }


}
