package Exam_180904;
import java.util.Collection;
import java.util.Iterator;


/*
Es. 2
 */



public class ClassCompareMany {

    public static <A extends Comparable<B>, B> int compareMany(Collection<A> a, Collection<B> b) {
        int result = -1;
        // check if the length is the same
        if ( a.size() == b.size() ) {
            // check if all the elements are the same
            Iterator ia = a.iterator();
            Iterator ib = b.iterator();
            result = 0;
            while ( ia.hasNext() && ib.hasNext() && result == 0 ) {
                A aa = (A) ia.next();
                B bb = (B) ib.next();
                result = aa.compareTo(bb);
            }
        }
        return result;
    }

}
