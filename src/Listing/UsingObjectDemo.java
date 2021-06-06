package Listing;
import javax.swing.JOptionPane;

class MyClass {
    int number;
    char symbol;
}

public class UsingObjectDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.number = 100;
        obj.symbol = 'A';

        String text = "Число: " + obj.number + "\n" + "Символ: " + obj.symbol;

        JOptionPane.showMessageDialog(null, text);
    }
}
