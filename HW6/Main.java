package org.example.HW6;

public class Main {
    public static void main(String[] args) {
        Logger.getLogger().addLogNote("Первая запись");
        Logger.getLogger().addLogNote("Вторая запись");
        Logger.getLogger().addLogNote("Третья запись");

        Logger.getLogger().showLogFile();
    }
}
