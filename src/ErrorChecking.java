public class ErrorChecking {
    public static void main(String[] args) {
        System.out.println("Метод main() успешно запущен");
        method1();
        System.out.println("Метод main() заканчивает свою работу");
    }
    static void method1() {
        try {
            System.out.println("Первый метод передаёт привет!");
            method2();
        } catch(ArithmeticException err) {
            System.out.println(err.getMessage());
        }
    }
    static void method2() {
        int x = 10, y = 0;
        int z = x/y;
        System.out.println(z);
        System.out.println("Второй метод");
    }
}

