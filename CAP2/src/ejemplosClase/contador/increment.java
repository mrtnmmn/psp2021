package ejemplosClase.contador;

public class increment extends Thread{

    private counter count;

    public increment(String n, counter c) {
        setName(n);
        this.count = c;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            count.increment();
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " contador vale " + count.getValor());
    }

}
