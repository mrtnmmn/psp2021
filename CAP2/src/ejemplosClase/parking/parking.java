package ejemplosClase.parking;

public class parking {

    int plazasTotales = 40;
    int plazasOcupadas = 0;

    public synchronized void entrada(int numero) {
        while (plazasOcupadas >= plazasTotales) {
            try {
                wait();
                System.out.println("Vehiculo esperando: " + numero);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Entra el coche: " + numero);
        plazasOcupadas++;
        System.out.println("Plazas ocupadas: " + plazasOcupadas);
        notifyAll(); // podria sobrar
    }

    public synchronized void salida(int numero) {
        System.out.println("Sale el coche numero: " + numero);
        plazasOcupadas--;
        System.out.println("Plazas Ocupadas: " + plazasOcupadas);
        notifyAll();
    }
}
