package kr.hs.study.beans;

public class Chef {
    private String name;
    private int age;

    public Chef(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
