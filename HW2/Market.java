package org.example.HW2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour{
    List<Buyer> actors = new ArrayList<>(); // список покупателей
    Queue<Buyer> actrosQueue = new ArrayDeque<>(); // очередь покупателей
    @Override // Переопределенный метод интерфейса MarketBehaviour фиксирует вход покупателя в магазин
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override // Переопределенный метод интерфейса MarketBehaviour фиксирует выход покупателя из магазина
    public void replaceFromMarket(Buyer actor) {
        System.out.println(actor.getName() + " вышел из магазина");
        actors.remove(0);
    }
    /**
    Переопределенный метод интерфейса MarketBehaviour
     */
    @Override
    public void update() {

    }
    /**
     * Перегруженный метод инкапсулирует использованные методы для исключения ошибочного использования
     */
    public void update(Buyer actor) {
        acceptToMarket(actor);
        takeInQueue(actor);
        takeOrders();
        giveOrders();
        replaceFromQueue();
        replaceFromMarket(actor);
    }

    @Override // Переопределенный метод интерфейса QueueBehaviour реализует постановку покупателя в очередь
    public void takeInQueue(Buyer actor) {
        System.out.println(actor.getName() + " встал в очередь");
        actrosQueue.add(actor);
    }

    @Override // Переопределенный метод интерфейса QueueBehaviour реализует оформление заказа
    public void takeOrders() {
        actrosQueue.element().isTakeOrder();
        System.out.println(actrosQueue.element().getName() + " оформил заказ");
    }

    @Override
    public void giveOrders() {
        actrosQueue.element().setMakeOrder();
        System.out.println(actrosQueue.element().getName() + " забрал заказ");
    }

    @Override
    public void replaceFromQueue() {
        System.out.println(actrosQueue.poll().getName() + " покинул очередь");

    }
}
