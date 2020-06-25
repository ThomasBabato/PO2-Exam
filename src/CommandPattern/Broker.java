package CommandPattern;

/*
Keeps an ArrayList of all the orders and after executes the ones on the queue
 */

import java.util.ArrayList;

public class Broker {
    ArrayList<Order> list = new ArrayList<>();

    public void takeOrder(Order o) {
        list.add(o);
    }

    public void placeOrders() {
        /* This is a for each loop and it gets all the elements in the list and it executes them */
        for (Order o: list) {
            o.execute();
        }
        /* clean the queue */
        list.clear();
    }



}
