package Collection_SortGatti;
import java.util.Comparator;

/*
In this case I create a class that implements the Comparator<T> interface
This allows me to create a class that only compares two elements (in this case they are Cats) and returns me a value telling me which is "bigger"
 */


public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        if ( c1.getWeight() >= c2.getWeight() ) {
            return 1;
        }
        else {
            return 0;
        }
    }


}
