package SingletonPattern;

public class Tester {
    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getIstance();

        s.showMessage();

    }

}
