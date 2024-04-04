package kr.hs.study.beans;

public class obj_Person {
    private int data1;
    private String school;
    private Person p1;
    private Person p2;

    public obj_Person(int data1, String school, Person p1, Person p2) {
        this.data1 = data1;
        this.school = school;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void proData() {
        System.out.println(data1);
        System.out.println(school);
        System.out.println(p1);
        System.out.println(p2);
    }
}
