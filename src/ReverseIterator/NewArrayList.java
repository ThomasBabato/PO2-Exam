package ReverseIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;



/* newArrayList class */
public class NewArrayList<T> extends ArrayList<T> {

    /* constructor */
    public NewArrayList () {
        super(); /* here I'm calling the constructor of the superclass */
    }


    /* override of iterator */
    public Iterator<T> iterator() {

        /* anonymous class */
        return new Iterator<T>() {
            private int pos = size() - 1;

            public boolean hasNext() {
                return pos >= 0;
            }
            public T next() {
                return get(pos--);
            }
        };
    }


}
