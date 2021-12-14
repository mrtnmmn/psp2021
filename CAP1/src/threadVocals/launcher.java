package threadVocals;

import java.io.File;
import java.io.IOException;

public class launcher {

    public void launch(String c, String fich) {

        String clase = "threadVocals/contador.java";
        ProcessBuilder pb;
        File dir = new File("/run/media/mrtnmmn/USB00/CICLO/PSP/CAP1/src/");

        try {
            pb = new ProcessBuilder("java", clase, c);

            pb.directory(dir);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fich));
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        launcher l = new launcher();

        l.launch("a", "resultA.txt");
        l.launch("e", "resultE.txt");
        l.launch("i", "resultI.txt");
        l.launch("o", "resultO.txt");
        l.launch("u", "resultU.txt");
    }

}
