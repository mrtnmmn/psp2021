package ejemplosClase.contador;

public class decrement extends Thread{

    private counter count;

    public decrement(String n, counter c) {
        setName(n);
        this.count = c;
    }

    public void run() {
        for (int j = 0; j < 300; j++) {
            count.decrement();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " contador vale " + count.getValor());
    }

}
