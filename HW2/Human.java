package org.example.HW2;

public class Human extends Buyer implements BuyerBehaviour{
    @Override // переопределение метода вызова имени покупателя
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        super.isMakeOrder = true; // экземпляр родительского класса (Buyer)
    }

    @Override
    public void setTakeOrder() {
        super.isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
