package ReverseIterator;
import java.util.*;



public class ReverseIterator {
    public static void main (String[] args) {

        /* create ArrayList */
        ArrayList<Integer> al = new ArrayList<Integer>();


        /* Insert random values in the ArrayList */
        for ( int i = 0; i < 10; i++ ) {
            /*
            Random rand = new Random();
            rand.setSeed(System.currentTimeMillis());
            Integer r = rand.nextInt() % 256;
            al.add(r);
            */
            al.add(i);
        }

        /* lets create iterator */
        Iterator itr = al.iterator();

        /* print the list in order */
        while ( itr.hasNext() ) {
            Object o = itr.next();
            System.out.println( o + " + ");
        }

        /* to iterate al backwards lets use ListIterator */
        ListIterator li = al.listIterator(al.size());

        /* print the list backwards */
        while ( li.hasPrevious() ) {
            System.out.println(li.previous());
        }


    }
}
