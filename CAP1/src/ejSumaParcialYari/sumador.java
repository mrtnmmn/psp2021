package ejSumaParcialYari;

import java.io.File;
import java.io.IOException;

public class sumador {

    public void launch(String fich, String fichResul) {

        String clase = "ejSumaParcialYari/sumaParcial.java";
        ProcessBuilder pb;
        File dir = new File("/run/media/mrtnmmn/USB00/CICLO/PSP/CAP1/src/");

        try {
            pb = new ProcessBuilder("java", clase, fich);

            pb.directory(dir);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fichResul));
            pb.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        sumador sum = new sumador();

        sum.launch("../comercio.txt", "comercioResul.txt");
        sum.launch("../contabilidad.txt", "comercioResul.txt");
        sum.launch("../gerencia.txt", "gerenciaResul.txt");
        sum.launch("../informatica.txt", "informaticaResul.txt");
        sum.launch("../rrhh.txt", "rrhhResul.txt");
    }
}