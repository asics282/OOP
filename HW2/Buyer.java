package org.example.HW2;

public abstract class Buyer implements BuyerBehaviour{
    protected String name; // имя покупателя
    protected boolean isMakeOrder; // переменная, отвечающая за состояние готовности заказа (true = готов, false = неготов)
    protected boolean isTakeOrder; // переменная, отвечающая за получение заказа (true = получен, false = не получен)

    public abstract String getName(); // метод получения имени полукателя
}
