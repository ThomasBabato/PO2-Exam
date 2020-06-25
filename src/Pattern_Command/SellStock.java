package Pattern_Command;

public class SellStock implements Order {
    Stock s;

    /* constructor */
    public SellStock(Stock s) {
        this.s = s;
    }

    public void execute() {
        s.sellStock();
    }


}
