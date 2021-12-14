package ejemplosClase.pilasFIFO;

public class test {


    public static void main(String[] args) {

        ColaS cola = new ColaS();
        productor p = new productor(cola, 'P');

        consumidor c = new consumidor(cola, 'C');

        p.start();
        c.start();
    }
}