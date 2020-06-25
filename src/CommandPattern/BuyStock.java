package CommandPattern;

public class BuyStock implements Order {
    Stock s;

    /* constructor
    * Saves the Stock on which I will do the execute
    * */
    public BuyStock (Stock s) {
        this.s = s;
    }

    public void execute() {
        s.buyStock();
    }

}
