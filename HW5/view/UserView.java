package org.example.HW5.view;

import org.example.HW4.VendingMachineAllBeverage;
import org.example.HW5.controller.Controller;

public class UserView {
    public void UserViewImpl(){
        System.out.println("В автомате доступны следующие ГОРЯЧИЕ НАПИТКИ: ");
        Controller controller1 = new Controller();
        Controller controller2 = new Controller();
        Controller controller3 = new Controller();
        controller1.getCoffee().sayTemperature();
        controller2.getTea().sayTemperature();
        controller3.getChocolate().sayTemperature();

        VendingMachineAllBeverage AllHotDrinks = new VendingMachineAllBeverage();
        Controller controller4 = new Controller();
        AllHotDrinks.initProduct(controller4.getDrinks());
        System.out.println("В автомате следующие напитки имеют температуру <= 80: ");
        // Поиск по температуре <= 80
        AllHotDrinks.getProduct(80);
        // Поиск по названию
        AllHotDrinks.getProduct("espresso");
    }
}
