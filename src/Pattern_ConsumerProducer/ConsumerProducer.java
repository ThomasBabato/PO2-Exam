package Pattern_ConsumerProducer;
import java.util.ArrayList;
import java.util.List;



public class ConsumerProducer {

    public static class Consumer extends Thread {
        List<Integer> l;

        /* constructor */
        public Consumer(List<Integer> l) {
            this.l = l;
        }

        /* code executed by the thread Consumer */
        public void run () {
            /* an infinite loop */
            while (true) {
                /* if the list has one or more elements */
                if ( !l.isEmpty()  ) {
                    /* synchronized */
                    synchronized (l) {
                        /* read the first number from the list */
                        int n = l.get(0);
                        /* print the element just read */
                        System.out.println("Consumer: " + n);
                        /* remove first element (the one I just read) from the list */
                        l.remove(0);
                    }
                }
                /* the list is empty */
                else
                    System.out.println("Consumer: list empty");
                /* put the Thread to sleep */
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* thread that populates the ArrayList */
    public static class Producer extends Thread {
        List<Integer> l;
        int n;

        /* constructor */
        public Producer (List<Integer> l) {
            this.l = l;
            n = 0;
        }

        /* code executed by the thread Producer */
        public void run () {
            /* an infinite loop */
            while(true) {
                /* synchronized
                * Dentro le sue parentesi devi mettere un mutex, cioè un oggetto (qualsiasi) che faccia da semaforo.
                * Basta che utilizzi sempre lo stesso semaforo per i Thread in questione :)
                * In questo caso usiamo l dato che non va bene che la lista venga utilizzata da una "entità" alla volta
                * */
                synchronized (l) {
                    /* print element to insert */
                    System.out.println("Producer: " + n);
                    /* add element to List */
                    l.add(n);
                }
                n++;
                /* put the Thread to sleep */
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main (String[] args) {
        List<Integer> l = new ArrayList<>();
        Consumer c = new Consumer(l);
        Producer p = new Producer(l);

        /* the threads start */
        c.start();
        p.start();

        /* join -> aspetta che un determinato thread finisca, è una chiamata bloccante.
        * Se il thread viene interrotto e non finisce il suo normale ciclo di vita ritorna un'eccezione che deve essere gestita  */
        try {
            c.join();
            p.join();
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }

    }


}
