package ejemplosClase.pilasFIFO;

import java.util.Random;

public class productor extends Thread{

    private ColaS cola;
    private char l;

    public productor(ColaS cola, char l ) {
        this.cola = cola;
        this.l = l;
    }

    public char generaCar() {
        char a;
        Random rnd = new Random();
        a = (char) (97 + rnd.nextInt(25));
        return a;
    }

    public void run() {
        char aux;
        for(int i = 0; i < 5; i++) {
            aux = generaCar();
            cola.put(aux);
            System.out.println(i + " => productor: " + aux);
        }
    }
}
