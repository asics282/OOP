package org.example.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotBeverage coffee = new HotBeverage("espresso",100, 50, 90);
        HotBeverage tea = new HotBeverage("black",60, 100, 85);
        HotBeverage chocolate = new HotBeverage("hot chocolate",160, 50, 60);

        // список горячих напитков
        List<HotBeverage> drinks = new ArrayList<>(Arrays.asList(coffee, tea, chocolate));
//        drinks.add(coffee);
//        drinks.add(tea);
//        drinks.add(chocolate);

        System.out.println("В автомате доступны следующие ГОРЯЧИЕ НАПИТКИ: ");
        coffee.sayTemperature();
        tea.sayTemperature();
        chocolate.sayTemperature();

        VendingMachineAllBeverage AllHotDrinks = new VendingMachineAllBeverage();
//        HotDrinksVendingMachine HotDrinks = new HotDrinksVendingMachine();
        AllHotDrinks.initProduct(drinks);
        System.out.println("В автомате следующие напитки имеют температуру <= 80: ");
        // Поиск по температуре <= 80
        AllHotDrinks.getProduct(80);
        // Поиск по названию
        AllHotDrinks.getProduct("espresso");

        // ПОЧЕМУ НЕ РАБОТАЕТ ВВОД В КОНСОЛЕ?
//        Scanner console = new Scanner(System.in);
//        String name3 = console.nextLine();
//        int temp3 = console.nextInt();
//        HotDrinks.getProduct(temp3);
//        HotDrinks.getProduct(name3);
    }

}
