package ejemplosClase.pilasFIFO;

public class consumidor extends Thread{

    private ColaS cola;
    private char a;

    public consumidor(ColaS cola, char a ) {
        this.cola = cola;
        this.a = a;
    }

    public void run() {
        char escupe = 55;
        for(int i = 0; i < 5; i++) {
            escupe = cola.get();
            System.out.println(i + " => consumidor: " + escupe);
        }
    }
}
