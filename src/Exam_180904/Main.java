package Exam_180904;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// 3D

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        SkippableArrayList<Integer> slist = new SkippableArrayList<>();

        // populate slist with five random numbers between 0 and 10
        Random r = new Random();
        for (int i=0; i<5; i++) {
            slist.add(r.nextInt(11));
        }

        // Print slist
        System.out.print("\n\nPRINT SLIST:  ");
        for (int i=0; i<slist.size(); i++) {
            System.out.print(slist.get(i)+", ");
        }

        // Define the Iterator and what it doeas
        Iterator islist = slist.iterator( (x) -> x>5, new Either<Integer>() {

            @Override
            public Integer onSuccess(Integer integer) {
                return integer+1;
            }

            @Override
            public void onFailure(Integer integer) throws Exception {
                list.add(new Integer(integer));
            }
        } );

        // invoke the iterator
        while ( islist.hasNext() ) {
            islist.next();
        }

        // print list
        System.out.print("\n\nPRINT LIST:  ");
        Iterator ilist = list.iterator();
        while ( ilist.hasNext() ) {
            System.out.print(ilist.next()+", ");
        }

        // print slist
        System.out.print("\n\nPRINT SLIST:  ");
        for (int i=0; i<slist.size(); i++) {
            System.out.print(slist.get(i)+", ");
        }


    }
}