package ejemplosClase.prodCons;

public class colaS {

    //implementamos la cola más simple de la historia--> 1 entero
    //sincronizada

    private int numero;
    private boolean disponible = false;

    public synchronized void put(int valor) {
        while (disponible == false) {
            //mientras no halla número =>espera
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        numero = valor;
        disponible = true;
        notifyAll();
    }

    public synchronized int get() {
        while (disponible == false) {
            //mientras no halla número =>espera
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        disponible = false;
        notifyAll();
        return numero;
    }


    @Override
    public String toString() {
        return "colaS{" +
                "numero=" + numero +
                ", disponible=" + disponible +
                '}';
    }
}