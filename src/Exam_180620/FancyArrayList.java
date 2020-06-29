package Exam_180620;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;


public class FancyArrayList<E> extends ArrayList<E> {
    int s;

    public Iterator<E> iterator(int step, Function<E,E> f) {
        this.s = step;

        return new FancyIterator<E>(this,f,step);

        /*
        return new Iterator() {
            int pos = s>0 ? 0 : size()-1;

            @Override
            public boolean hasNext() {
                if ( s > 0 ) {
                    return (pos+s) < size();
                }
                else {
                    return (pos+s) > 0;
                }
            }

            @Override
            public Object next() {
                if ( s > 0 ) {
                    pos += s;
                    return get(pos);
                }
                return null;
            }

        };
        */
    }

    public Iterator<E> iterator() {
        return iterator(1,x->x);
    }

    public Iterator<E> backwardIterator() {
        return iterator(-1,x->x);
    }


    // static class FancyIterator
    public static class FancyIterator<E> implements Iterator<E> {
        private FancyArrayList<E> list;
        private Function<E,E> f;
        private int step;
        private int pos;

        // Constructor
        public FancyIterator(FancyArrayList<E> list, Function<E,E> f, int step) {
            this.list = list;
            this.f = f;
            this.step = step;
            if ( step > 0 ) {
                pos = 0;
            }
            else {
                pos = list.size() - 1;
            }
        }

        // has next
        public boolean hasNext() {
            if ( step > 0 ) {
                return pos < list.size();
            }
            else {
                return pos > 0;
            }
        }

        // next
        public E next() {
            pos+=step;
            E temp = list.get(pos);
            return f.apply((temp));
        }
    }

}
