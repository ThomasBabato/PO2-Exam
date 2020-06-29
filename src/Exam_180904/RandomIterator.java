package Exam_180904;
import java.util.Iterator;
import java.util.Random;

// 1C


public class RandomIterator<Integer> implements Iterator<Integer> {
    private Random rrr;
    private int dim;

    // Constructor
    public RandomIterator (int dim) {
        rrr  = WrapperRandom.getIstance();
        this.dim = dim;
    }

    @Override
    public boolean hasNext() {
        return dim > 0;
    }

    @Override
    public Integer next() {
        if ( dim > 0 ) {
            dim--;
            return /*rrr.nextInt(50)*/null;
            // IDK why Its not working, the syntax is correct
        }
        else {
            return null;
        }

    }
}
