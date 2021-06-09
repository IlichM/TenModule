package VebinarJavaCollections;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int capacity = 20;
        int size = 0;
        String[] toDoList = new String[capacity];
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add item\n2.Show all\n3.Exit");
        int choose = sc.nextInt();
        if(choose == 1) {
            System.out.println("Enter new toDo");
        } else if(choose ==2) {

        }


    }
}
