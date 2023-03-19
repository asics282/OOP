package org.example.HW5.controller;

import org.example.HW4.HotBeverage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    HotBeverage coffee = new HotBeverage("espresso", 100, 50, 90);
    HotBeverage tea = new HotBeverage("black", 60, 100, 85);
    HotBeverage chocolate = new HotBeverage("hot chocolate", 160, 50, 60);

    // список горячих напитков
    List<HotBeverage> drinks = new ArrayList<>(Arrays.asList(coffee, tea, chocolate));

    public List<HotBeverage> getDrinks() {
        return drinks;
    }

    public HotBeverage getCoffee() {
        return coffee;
    }

    public HotBeverage getTea() {
        return tea;
    }

    public HotBeverage getChocolate() {
        return chocolate;
    }
}
