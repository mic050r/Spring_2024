package kr.hs.study.beans;

public class Person {
    private String name;
    private int age;
    private String addr;

    public void eat() {
        System.out.println("냠냠 먹다");
    }

    public Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
}
