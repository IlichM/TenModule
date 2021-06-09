package ExCat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String args[]) {

        List<Cat> persons = new ArrayList<>();

        persons.add(new Cat(1, "Рыжик", 7));
        persons.add(new Cat(6, "Белый", 5));
        persons.add(new Cat(3, "Незрячий", 2));

        System.out.println("Сортировка по имени:");

        Collections.sort(persons, new NameComparator());

        for(Cat person : persons){
            System.out.println(person.id + " "
                    + person.name + " "
                    + person.age);
        }

        System.out.println("Сортировка по возрасту:");

        Collections.sort(persons, new AgeComparator());

        for(Cat person : persons){
            System.out.println(person.id + " "
                    + person.name + " "
                    + person.age);
        }
    }
}