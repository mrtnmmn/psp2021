package ejemplosClase.ticTac;

public class tac extends Thread{

    static final String TAC = "TAC";

    synchronizer show;

    @Override
    public void run() {

        do {
            System.out.println(TAC);

            try {
                Thread.sleep((int) (Math.random() * 1000));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}