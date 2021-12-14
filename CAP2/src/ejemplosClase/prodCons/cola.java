package ejemplosClase.prodCons;

public class cola {

    private int numero;
    private boolean disponible = false;

    public synchronized void put(int valor) {
        numero = valor;
        disponible = true;
    }

    public synchronized int get() {
        if (disponible) {
            disponible = false;
            return numero;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "cola{" +
                "numero=" + numero +
                ", disponible=" + disponible +
                '}';
    }
}