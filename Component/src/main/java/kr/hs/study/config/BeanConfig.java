package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
// kr.hs.study.beans 패키지 밑에 있는 어노테이션들을 분석해서 빈으로 만들고 보관하고 설정해라.
public class BeanConfig {


}
