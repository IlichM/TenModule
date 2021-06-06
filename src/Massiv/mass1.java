package Massiv;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class mass1 {
    public static void main(String[] args) {

        char[] charArray = new char[5];
        charArray[0] = 'r';
        charArray[1] = 'a';
        charArray[2] = 'w';
        charArray[3] = 'c';
        charArray[4] = 'h';
        for(int i = 0; i < charArray.length; i++ ) {
        System.out.print(charArray[i]); }
        System.out.println();

        Arrays.sort(charArray);
        System.out.println(charArray);

        Arrays.fill(charArray, 'f');
        System.out.println(charArray);
    }
}
