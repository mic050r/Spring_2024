package kr.hs.study.config;

import kr.hs.study.beans.Chef;
import kr.hs.study.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {
    @Bean
    public Chef chef1() {
        return new Chef("임지현", 18);
    }

    @Bean
    public Order order1() {
        return new Order("냉면", "포도주스");
    }

}
