package ejSumaParcial;

import java.io.*;
import java.util.ArrayList;

public class launcher {

    public void launch(String fich, String fichSol) {
        String clase = "ejSumaParcial/sumador.java";
        ProcessBuilder pb;
        File dir = new File("/run/media/mrtnmmn/USB00/CICLO/PSP/CAP1/src/");

        try {
            pb = new ProcessBuilder("java", clase, fich);

            pb.directory(dir);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fichSol));
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        launcher l = new launcher();

        String[] arr = {"comercio.txt", "contabilidad.txt", "gerencia.txt", "informatica.txt", "rrhh.txt"};

        for (int i = 0; i < arr.length; i++) {
            l.launch("../" + arr[i], "res" + arr[i]);
        }

        Thread.sleep(5000);

        sumar(arr);
    }

    public static void sumar(String[] arr) {

        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            try {
                FileReader fr = new FileReader(("res" + arr[i]));
                BufferedReader br = new BufferedReader(fr);

                String line = br.readLine();
                System.out.println(line);
                suma += Integer.parseInt(line);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Suma total: " + suma);
    }
}