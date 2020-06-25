package Pattern_Factory;
import java.util.Scanner;



public class Tester {
    public static void main(String[] args) {
        Shape s;
        Factory f = new Factory();

        s = f.createShape("circle");

        s.draw();



    }
}
