package SkipElementIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class NewArrayList<T> extends ArrayList<T> {

    /* override iterator with lambda */
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int pos = 0;

            public boolean hasNext() {
                return pos < size();
            }
            /* print only the lements in event position */
            public T next() {
                if ( pos%2 == 0 ) {
                    return get(pos++);
                }
                pos++;
                return null;
            }
        };
    }


}
