public class Sheep implements Animal{

    @Override
    public void eat() {
        System.out.println("풀");
    }

    @Override
    public void sleep() {
        System.out.println("쉬쉬");
    }
}
