package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {
    public void before(){
        System.out.println("before Method");
    }
    public void after(){
        System.out.println("after Method");
    }
    public void afterReturning(){
        System.out.println("예외발생없이 종료된 후 실행되는 메서드");
    }
    public void afterThrowing(Throwable e){
        System.out.println("예외발생  메서드");
        System.out.println("e : "+ e);
    }
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("전에 around 호출1");
        pjp.proceed();
        System.out.println("후에 around 호출2");
    }
}