package org.example.HW5.model;

import org.example.HW4.HotBeverage;
import org.example.HW4.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineAllBeverage <T extends HotBeverage> implements VendingMachine {
    List<T> hotDrinksList = new ArrayList<>();

    @Override
    public void initProduct() { }
    public void initProduct(List<T> list) {
        this.hotDrinksList = list;
    }
    @Override
    public String getProduct() {return null;}
    public String getProduct(int temp) {
        for (T el : hotDrinksList) {
            if (el.getTemperature() <= temp) {
                System.out.println(el.getName());
            }
        }
        return null;
    }
    // Перегруженный метод getProduct по названию
    public String getProduct(String name1) {
        for (T el : hotDrinksList) {
            if (el.getName().equals(name1)) {
                System.out.println(el.getName());
            }
        }
        return null;
    }
}
