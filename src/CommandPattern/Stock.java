package CommandPattern;

/*
Class on which the operations have actions
 */


public class Stock {
    public String name="Stonks";
    public int value=0;

    public void sellStock(int n) {
        value -= n;
    }

    public void buyStock(int n) {
        value += n;
    }



}
