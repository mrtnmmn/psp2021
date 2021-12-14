package ejemplosClase.prodCons;

import java.util.Random;

public class consumidor extends Thread{

    private colaS cola;
    private int n;

    public consumidor(colaS cola, int n ) {
        this.cola = cola;
        this.n = n;
    }

    public void run() {
        int valor = 0;
        for(int i = 0; i < 5; i++) {
            valor = cola.get();
            System.out.println(i + " => consumidor: " + n + " " + ",  consume: " + valor);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
