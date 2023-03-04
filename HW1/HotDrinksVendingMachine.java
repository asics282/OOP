package org.example.HW1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotBeverage> hotDrinksList = new ArrayList<>();
    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotBeverage> list) {
        this.hotDrinksList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }
    // Перегруженный метод getProduct по поиску напитков по температуре
    public String getProduct(int temp) {
        for (HotBeverage el : hotDrinksList) {
            if (el.getTemperature() <= temp) {
                System.out.println(el.getName());
            }
        }
        return null;
    }
    // Перегруженный метод getProduct по названию
    public String getProduct(String name1) {
        for (HotBeverage el : hotDrinksList) {
            if (el.getName().equals(name1)) {
                System.out.println(el.getName());
            }
        }
        return null;
    }
}