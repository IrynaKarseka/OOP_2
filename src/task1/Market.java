package task1;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehaviour {
    private List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.print(actor.name + " Пришел в маркет. ");

        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {

        for (int i = actorList.size();i>0; i--) {
            Actor a = actorList.get(0);
            System.out.println(a.name + " Уходит из маркета. ");
            actorList.remove(actorList.get(0));
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.name + " стал в очередь.");
        actor.setMakeOrder(false);
        actor.setTakeOrder(false);
    }

    @Override
    public void takeOrders() {
        for(Actor q : queue) {
            if (!q.isMakeOrder()) {
                System.out.print(q.name + " еще не делал заказ. ");
                System.out.print("Выбирает...  . ");
                System.out.println(q.name + " делает заказ");
                q.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor q : queue) {
            if (q.isMakeOrder) {
                System.out.print(q.name + " заказал...");
                q.setTakeOrder(true);
                System.out.println(q.name + " забирает заказ и выходит из очереди");
            }
        }
    }
    @Override
    public void releaseFromQueue() {
        List<Actor> actorsInTheMarket = new ArrayList<>();
        actorsInTheMarket.addAll(queue);
        for (Actor actor : actorsInTheMarket) {
            if (actor.isTakeOrder()) {
                queue.remove(queue.get(0));
            }
        }
        releaseFromMarket(actorsInTheMarket);
    }
}
