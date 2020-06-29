package Iterator_SkipElement;
import java.util.ArrayList;
import java.util.Iterator;


public class NewArrayList<T> extends ArrayList<T> {

    /* override iterator with lambda */
    public Iterator<T> iterator(int n) {
        return new Iterator<T>() {
            private int pos = 0;

            public boolean hasNext() {
                return pos+n < size();
            }

            /* print only the elements in event position */
            public T next() {
                return get(pos+=n);
            }
        };
    }


}
