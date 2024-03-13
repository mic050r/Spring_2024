public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal sheep = new Sheep();

        System.out.println("고양이");
        cat.eat();
        cat.sleep();

        System.out.println("강아지");
        dog.eat();
        dog.sleep();

        System.out.println("양");
        sheep.eat();
        sheep.sleep();
    }
}