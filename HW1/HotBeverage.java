package org.example.HW1;
/*
Класс горячих напитков (наследник класса Напитков)
 */
public class HotBeverage extends Beverage {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public int setTemperature() {
        return this.temperature;
    }
    // конструктор класса (у каждого класса дб конструктор)
    public HotBeverage(String name, int price, int volume, int temperature) {
        setName(name);
        setPrice(price);
        setVolume(volume);
        this.temperature = temperature;
    }
    // показать температуру напитка
    void sayTemperature(){
        System.out.println("Температура напитка " + getName() + " равна " + getTemperature());
    }
}
