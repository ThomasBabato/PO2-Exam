package Exam_180904;
import java.util.ArrayList;
import java.util.Iterator;

// 3C

public class SkippableArrayList<E> extends ArrayList<E> {


    public Iterator<E> iterator (Predicate<E> p, Either<E> f) {
        return new Iterator() {
            int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size();
            }

            @Override
            public E next() {
                E temp = get(pos++);

                if ( p.apply(temp) ) {
                    return f.onSuccess(temp);
                }
                else {
                    try {
                        f.onFailure(temp);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return temp;
                }
            }

        };
    }


}
