package org.example.HW5.model;

public class HotBeverage extends Beverage{
    private int temperature;
    public int getTemperature() {return temperature;}
    public void setTemperature(int temperature) {this.temperature = temperature;}

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
