package ejemplosClase.ejercicio1A;

public class Testigo {

    private boolean testigoOcupado;

    public synchronized void toma() {
        while (testigoOcupado) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error en wait");
            }
        }
        testigoOcupado = true;
        notifyAll();
    }

    public synchronized void deja() {
        while (!testigoOcupado) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error en wait");
            }
        }
        testigoOcupado = false;
        notifyAll();
    }
}
