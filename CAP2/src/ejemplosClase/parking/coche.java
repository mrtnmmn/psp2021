package ejemplosClase.parking;

public class coche extends Thread implements Comparable<coche>{

    public parking parking;
    public int numero;
    public long tiempo;

    public coche(parking park, int numero) {
        super();
        this.parking = park;
        this.numero = numero;
    }

    @Override
    public void run() {
        parking.entrada(numero);

        int tiempo = (int) (Math.random() * 2 + 2);
        this.tiempo = tiempo * 1000;
        try {
            Thread.sleep(tiempo * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        parking.salida(numero);
    }

    @Override
    public int compareTo(coche coche) {

        if (this.tiempo > coche.tiempo) {return -1;}
        else {return 1;}

    }

    @Override
    public String toString() {
        return "coche{" +
                "parking=" + parking +
                ", numero=" + numero +
                ", tiempo=" + tiempo +
                '}';
    }
}
