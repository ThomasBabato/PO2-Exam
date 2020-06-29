package Iterator_ApplyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/*
the lambda expression doesn't work. Idk why.
 */



public class ApplyFunctionIterator {





    /* ApplyFunctionAL static class
    * It's necessary to create this class static if we declare all in the same file, as the Professor does */
    public static class ApplyFunctionAL<T> extends ArrayList<T> {
        private Function<T,T> f;

        //Constructor
        public ApplyFunctionAL (Function<T,T> f) {
            super(); // call of the ArrayList constructor
            this.f = f;
        }

        @Override
        public Iterator<T> iterator() {
            Iterator<T> i = super.iterator() ;

           return new Iterator<T>() {

               @Override
               public boolean hasNext() {
                   return i.hasNext();
               }

               @Override
               public T next () {
                   if ( i.hasNext() ) {
                       T temp = i.next();
                       temp = f.apply(temp);
                       return temp;
                   }
                   else {
                       return null;
                   }
               }



           };
        }

    }

    /* main */
    public static void main (String[] args) {
        ApplyFunctionAL<Integer> l = new ApplyFunctionAL<>((Integer n) -> n+1 );

        /* add elements */
        for (int i=0; i<10; i++) {
            l.add(i);
        }



        /* create iterator and apply a function */
       // Function<Integer,Integer> f = (Integer n) ->5;
        Iterator<Integer> it = l.iterator();

        /* print the list and apply a function */
        while ( it.hasNext() ) {
            System.out.println(it.next() + ", ");
        }


    }





}
