package ejemplosClase;

public class testPrimerHilo {

    public static void main(String[] args)  {

        primerHilo uno = new primerHilo(10, "Denji");
        primerHilo dos = new primerHilo(10, "Makima");

        uno.start();
        dos.start();

        try {
            uno.join();
            dos.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin del main (hilo 0)");

    }
}
