package kr.hs.study.beans;

// 관심사 메소드들 (joint point)
// target 클래스
public class TestBean1 {
    final public void method1() {
        System.out.println("TestBean1의 method1 호출");
    }

    final public void method2() {
        System.out.println("TestBean2의 method2 호출");
    }
}
