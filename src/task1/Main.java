package task1;

public class Main {
    public static void main(String[] args) {

        Human petya = new Human("Петя");
        Human dima = new Human("Дима");

        Market market = new Market();

        market.acceptToMarket(petya);
        market.acceptToMarket(dima);
        market.update();
    }
}