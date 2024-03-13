
public class Person {
    public static void main(String args[]) {
        person p = new person();
        p.setName("김");
        p.setAge(30);

        System.out.println("이름 : " + p.getName() + ", 나이 : " + p.age);
    }

    public static class person {
        String name;
        int age;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

