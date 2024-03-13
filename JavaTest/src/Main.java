public class Main {
    public static void main(String[] args) {
        // 1. hello 객체 생성
        HelloWordKr hello = new HelloWordKr();
        callMethod(hello);
    }

    public static void callMethod(HelloWordKr h) {
        h.sayHello();
    }
}
