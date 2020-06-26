package Collection_SortGatti;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Tester {
    public static void main (String[] args) {
        String name;
        int weight, num;

        ArrayList<Cat> l = new ArrayList<Cat>();
        Scanner in = new Scanner(System.in);

        /* users inserts how many elements to put in the arraylist */
        System.out.print("How many cats?:  ");
        do { /* asks in input num until the user inserts a positive value */
            num = in.nextInt();
        } while ( num<0 );

        /* users inserts num cats */
        for (int a=0; a<num; a++) {
            System.out.println("Cat n° " + a );
            System.out.print("Name:  ");
            name = in.next();
            System.out.print("\nWeight:  ");
            weight = in.nextInt();
            l.add(new Cat(name,weight));
        }

        /* print cats not ordered */
        Iterator<Cat> i = l.iterator();
        System.out.println("\n\nNOT ORDERED CATS");
        while ( i.hasNext() ) {
            Cat temp = i.next();
            System.out.println("Cat n°"+i+", Name: "+temp.getName()+",  Weight:  "+temp.getWeight());
        }

        /* order cats */
        CatComparator c = new CatComparator();
        int indexfound;
        if (l.size()>1) {
            for (int x=0; x<l.size()-1; x++) {
                indexfound = x;
                for (int j=x+1; j<l.size(); j++) {
                    if ( c.compare(l.get(indexfound), l.get(j)) == 1 ) {
                        indexfound = j;
                    }
                }
                /* switch i with j */
                if ( indexfound != x ) {
                    name = l.get(indexfound).getName();
                    weight = l.get(indexfound).getWeight();
                    l.get(indexfound).setName(l.get(x).getName());
                    l.get(indexfound).setWeight(l.get(x).getWeight());
                    l.get(x).setName(name);
                    l.get(x).setWeight(weight);
                }
            }
        }

        /* print cats not ordered */
        i = l.iterator();
        System.out.println("\n\nORDERED CATS");
        while ( i.hasNext() ) {
            Cat temp = i.next();
            System.out.println("Cat n°"+i+", Name: "+temp.getName()+",  Weight:  "+temp.getWeight());
        }



    }
}
