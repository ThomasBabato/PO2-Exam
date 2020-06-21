package ReverseIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class ReverseIterator {
    public static void main (String[] args) {
        NewArrayList<Integer> nal = new NewArrayList<Integer>();

        /* lets add elements */
        for ( int i = 0; i < 10; i++ ) {
            nal.add(i);
        }

        /* Create Iterator */
        Iterator<Integer> i = nal.iterator();

        /* lets print the elements backwards */
        while ( i.hasNext() ) {
            System.out.println(i.next() + ", ");
        }

    }
}
