package task1;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) { // установить сделать заказ
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {   //  установить принять заказ
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {  //  сделать заказ
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {  //  принять заказ
        return super.isTakeOrder;
    }
}
