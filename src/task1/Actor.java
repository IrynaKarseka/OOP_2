package task1;

public abstract class Actor implements ActorBehavior {
    protected boolean isTakeOrder;  // принять заказ
    protected boolean isMakeOrder;  // сделать заказ
    protected final String name;    // имя

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
