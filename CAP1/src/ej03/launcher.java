package ej03;

import java.io.File;

public class launcher {

    public void launch(Integer n1, Integer n2, String fichResultado){
        String clase="ej03/sumador.java";
        ProcessBuilder pb;
        File directorio = new File("/run/media/mrtnmmn/USB00/CICLO/PSP/CAP1/src/");
        try {
            pb = new ProcessBuilder("java",clase,
                    n1.toString(),
                    n2.toString());
            pb.directory(directorio);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fichResultado));
            pb.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        launcher l = new launcher();
        l.launch(1, 2, "result1.txt");
        l.launch(6,18, "result2.txt");
        System.out.println("Ok");
    }

}
