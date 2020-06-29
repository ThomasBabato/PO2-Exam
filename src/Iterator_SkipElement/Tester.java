package Iterator_SkipElement;
import java.util.Iterator;



public class Tester {
    public static void main (String[] args) {
        NewArrayList<Integer> nal = new NewArrayList<>();

        /* populate */
        for ( int i = 0; i<10; i++ ) {
            nal.add(i);
        }

        /* get Iterator */
        Iterator i = nal.iterator(2);

        /* print only even elements */
        while ( i.hasNext() ) {
            Object o = i.next();
            if ( o != null ) {
                System.out.println(o.toString() + ", ");
            }
        }

    }
}
