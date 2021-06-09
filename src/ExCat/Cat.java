package ExCat;
import java.util.Comparator;
public class Cat {

    int id;
    String name;
    int age;

    Cat(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}

class AgeComparator implements Comparator<Cat> {
    public int compare(Cat p1,Cat p2) {
        if(p1.age == p2.age)
            return 0;
        else if(p1.age > p2.age)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Cat> {
    public int compare(Cat p1,Cat p2) {
        return p1.name.compareTo(p2.name);
    }
}