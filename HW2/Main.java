package org.example.HW2;

public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.name = "Павел";
        Market mk = new Market();
        mk.update(hm);
    }
}
