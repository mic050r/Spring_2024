public class Main {
    public static void main(String[] args) {

        // 2번 수정 필요
        HelloWorldEn hello1 = new HelloWorldEn();
        hello1.sayHello();

        // 다형성으로 수정 -> 1번만 수정 가능
        Hello hello = new HelloWorldEn();
        hello.sayHello();

    }
}