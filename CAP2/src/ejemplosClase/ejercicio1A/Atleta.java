package ejemplosClase.ejercicio1A;

public class Atleta extends Thread{

    private final int max = 11000;
    private final int min = 9000;

    private String nombre;
    private Testigo testigo;

    public Atleta( String nombre, Testigo testigo) {
        this.nombre = nombre;
        System.out.println(nombre + " esperando...");
        this.testigo = testigo;
    }

    @Override
    public synchronized void run() {
        System.out.println(nombre + " esperando...");
        this.testigo.toma();
        long tiempo = System.currentTimeMillis();
        System.out.println(nombre + " empieza a correr");

        try {
            sleep((long) Math.floor(Math.random() * (max - min) + min));
        } catch (Exception e){
            System.out.println("Error sleep!!");
        }

        System.out.println(nombre + " termina su relevo en " + (System.currentTimeMillis()-tiempo) + "ms");
        this.testigo.deja();
    }
}
