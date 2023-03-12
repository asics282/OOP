package org.example.HW3;
/*
Сортировка коллекции собак с помощью интерфейса Comparable
 */

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сортировка собак по высоте в холке с помощью интерфейса Comparable");
        Set dogs = new TreeSet();
        dogs.add(new Dogs("Барбос", 30));
        dogs.add(new Dogs("Матрос", 25));
        dogs.add(new Dogs("Барбарис", 45));
        for (Object d:dogs) {
            System.out.println(d);
        }
        System.out.println("--------");
        System.out.println("Сортировка собак по высоте в холке с помощью интерфейса Comparator");
        CompareDogs compareDogs = new CompareDogs();
        Set dogs2 = new TreeSet(compareDogs);
        dogs.add(new Dogs("Барбос", 30));
        dogs.add(new Dogs("Матрос", 25));
        dogs.add(new Dogs("Барбарис", 45));
        for (Object d:dogs) {
            System.out.println(d);
        }
    }
}
