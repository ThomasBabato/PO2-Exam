package Pattern_Factory;

/* class that given in input the neme of a shape in creates this shape and it returns it */

public class Factory {

    public Shape createShape(String s) {
        if ( s == "square" ) {
            return new Square();
        }
        else if ( s == "circle" ) {
            return new Circle();
        }
        else {
            return null;
        }
    }

}
