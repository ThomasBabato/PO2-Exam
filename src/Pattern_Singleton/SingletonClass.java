package Pattern_Singleton;

public class SingletonClass {
    private static SingletonClass s = new SingletonClass();

    /* I put the constructor private */
    private SingletonClass() {}

    /* static methon getIstance to return the istance of the object */
    public static SingletonClass getIstance() {
        return s;
    }

    /* what the object needs to do */
    public void showMessage() {
        System.out.println("What the class needs to do!");
    }
}
