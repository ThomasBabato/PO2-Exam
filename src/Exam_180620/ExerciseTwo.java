package Exam_180620;
import java.util.Comparator;
import java.util.List;



public class ExerciseTwo<A,B> {


    public static class Pair<A,B> {
        private final A a;
        private final B b;

        // constructor
        private Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }



    public static <E> Pair<E,E> findMinAndMax(List<? extends E> l, Comparator<E> c) {

        // check if the list has elements
        if ( l.size() > 0 ) {
            E max = l.get(0);
            E min = max;
            for ( E temp :  l ) { // Variabile che si utilizza per ciclare : lista da scorrere
                if ( c.compare(temp, max) > 0 ) {
                    max = temp;
                }
                if ( c.compare(temp, min) < 0 ) {
                    min = temp;
                }
            }
            return new Pair<E,E>(min,max);
        }
        return null;
    }


    public static <E extends Comparable<E>> Pair <E,E> findMinAndMax(List<E> l) {
        if ( l.size() > 0 ) {
            E min = l.get(0);
            E max = min;
            for (E temp : l) {
                if ( temp.compareTo(max) > 0 ) {
                    min = temp;
                }
                if ( temp.compareTo(min) < 0 ) {
                    max = temp;
                }
            }
            return new Pair(min,max);
        }
        return null;
    }

}
