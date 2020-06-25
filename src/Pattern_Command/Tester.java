package Pattern_Command;

public class Tester {
    public static void main (String[] args) {
        Stock s = new Stock();
        BuyStock buy = new BuyStock(s);
        SellStock sell = new SellStock(s);
        Broker b = new Broker();

        b.takeOrder(buy);
        b.takeOrder(sell);
        b.placeOrders();

    }
}
