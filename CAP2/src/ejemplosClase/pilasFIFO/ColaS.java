package ejemplosClase.pilasFIFO;

public class ColaS {

    private char[] cola = new char[5];
    private int posicionesOcupadas;

    public synchronized void put(char l) {
        while (posicionesOcupadas >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        cola[posicionesOcupadas] = 1;
        posicionesOcupadas++;
        notifyAll();
    }

    public synchronized char get() {
        while (posicionesOcupadas <= 0) {
            //mientras no halla número =>espera
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        posicionesOcupadas--;
        // disponible = false;
        notifyAll();
        // return letra;
        return 0;
    }

    @Override
    public String toString() {
        return "colaS{" +
                // "letra=" + letra +
                // ", semaforo=" + disponible +
                '}';
    }
}