package org.example.HW2;
/*
* Описание логики очереди – помещение вочередь/освобождение из очереди, принятие/отдача заказа
 */
public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void replaceFromQueue();
}
