package cap1;

import java.io.IOException;

public class ej01 {

    public void execute(String ruta) {
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String ruta = "/usr/bin/opera";

        ej01 launchProcesss = new ej01();
        launchProcesss.execute(ruta);
        System.out.println("Finalizado");

    }
}
