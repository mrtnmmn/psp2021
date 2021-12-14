package ejemplosClase.prodCons;

public class productor extends Thread{

    private colaS cola;
    private int n;

    public productor(colaS cola, int n ) {
        this.cola = cola;
        this.n = n;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            cola.put(i);
            System.out.println(i + " => productor: " + n + " " + ",  produce: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
