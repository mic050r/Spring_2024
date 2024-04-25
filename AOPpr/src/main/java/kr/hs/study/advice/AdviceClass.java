package kr.hs.study.advice;

import org.springframework.stereotype.Component;

@Component
public class AdviceClass {
    public void before() {
        System.out.println("before Method");
    }

    public void afterReturning() {
        System.out.println("예외 발생 없이 종료된 후 실행되는 메소드");
    }
}
