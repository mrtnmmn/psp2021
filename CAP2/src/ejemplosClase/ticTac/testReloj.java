package ejemplosClase.ticTac;

public class testReloj {

    public static void main(String[] args) {

        tic uno = new tic();
        tac dos = new tac();

        uno.start();
        dos.start();

        System.out.println("Fin main");

    }
}
