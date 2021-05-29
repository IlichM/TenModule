package Package1;

public class UnCheckedException {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 0;

        try {
            if(number2 == 0) {
                throw new DivisionByZeroException("Нельзя делить на 0");
            }
            System.out.println(number1/number2);
        } catch(DivisionByZeroException e) {
            System.err.println("Произошла ошибка!");
        } finally {
            System.out.println("Программа завершает свое действие. Всего доброго. ");
        }
    }
}
