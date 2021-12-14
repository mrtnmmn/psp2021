package ejemplosClase.prodCons;

public class testPC {

    public static void main(String[] args) {

        colaS cola = new colaS();

        productor p = new productor(cola, 1);
        consumidor c = new consumidor(cola, 1);

        p.start();
        c.start();
    }
}
