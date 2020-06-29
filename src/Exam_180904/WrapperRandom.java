package Exam_180904;
import java.util.Random;



public class WrapperRandom {
    static Random r;

    // private constructor
    private WrapperRandom() {}

    // static method that return the istance of Random
    public static Random getIstance() {
        if ( r == null ) {
            r = new Random();
        }
        return r;
    }


    // lets create the methods of the Random class
    public void setSeed(int seed) {
        r = new Random(seed);
    }

    public boolean nextBoolean() {
        return r.nextBoolean();
    }

    public int nextInt() {
        return r.nextInt();
    }

    public double nextDouble() {
        return r.nextDouble();
    }

}
