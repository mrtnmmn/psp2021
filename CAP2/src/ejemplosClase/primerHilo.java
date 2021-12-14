package ejemplosClase;

public class primerHilo extends Thread {
    private int x;
    private String n;

    primerHilo(int x, String n) {
        this.x = x;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < x; i++) {
            System.out.println("Hilo de ejecucuion: " + n + ", elemento: " + i);
        }
    }

}