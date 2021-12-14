package sumaParcialRangos;


import java.io.*;
import java.util.Scanner;

public class launcher {

    public static final String[] arr = {"comercio.txt", "contabilidad.txt", "gerencia.txt", "informatica.txt", "rrhh.txt"};
    public static int n1, n2;

    public static final Scanner ns = new Scanner(System.in);

    public void launch(String fich, String fichSol, String nA, String nB) {
        String clase = "sumaParcialRangos/sumador.java";
        ProcessBuilder pb;
        File dir = new File("/run/media/mrtnmmn/USB00/CICLO/PSP/CAP1/src/");

        try {
            pb = new ProcessBuilder("java", clase, fich, nA, nB);

            pb.directory(dir);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fichSol));
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        insertarRango();

        launcher l = new launcher();

        for (int i = 0; i < arr.length; i++) {
            l.launch("../" + arr[i], "res" + arr[i], Integer.toString(n1), Integer.toString(n2));
        }

        Thread.sleep(5000);

        sumar();

    }

    public static void sumar() {

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

    public static void insertarRango() {

        boolean res = false;
        String str = "";

        while (!res) {
            System.out.print("Inserta el rango de los valores a sumar separados por un guion (Ejemplo: 20-100): ");
            str = ns.nextLine();

            n1 = Integer.parseInt(String.valueOf(str.charAt(0)));
            n2 = Integer.parseInt(String.valueOf(str.charAt(2)));

            res = validarRango(n1,n2);
        }

    }

    public static boolean validarRango(int n1, int n2) {

        boolean res = false;

        if (n1 < n2) {
            res = true;
        }

        return res;
    }

}