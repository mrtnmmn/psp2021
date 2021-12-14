package ejemplosClase.ticTac;

public class tic extends Thread{

    static final String TIC = "TIC";


    @Override
    public void run() {

        do {
            System.out.println(TIC);

            try {
                Thread.sleep((int) (Math.random() * 1000));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}