package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new MyNameComparator());


        set.add(new Person("Alin", 22));
        set.add(new Person("Mihai", 25));
        set.add(new Person("Cristian", 32));
        set.add(new Person("Raul", 89));
        for (Person pers : set) {
            System.out.println(pers.getAge() + " " + pers.getName());
        }

    }


}
