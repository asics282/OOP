package org.example.HW2;
/*
Описание логики магазина – приход/уход покупателей, обновление состояния магазина
 */
public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void replaceFromMarket(Buyer actor);
    void update();
}
