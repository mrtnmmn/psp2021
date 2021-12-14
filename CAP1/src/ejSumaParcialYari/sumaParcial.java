package ejSumaParcialYari;

import java.io.*;
import java.util.Scanner;

public class sumaParcial {

    //fichero a manipular --> nombreFichero
    //fichero de suma parcial --> nombreFichero


    public long sumaSimple(String nombreFichero) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
        String line;
        long total = 0;
        while ((line = br.readLine()) != null) {
            int k = Integer.parseInt(line);
            total += k;
            System.out.println(total);
        }
        br.close();
        return total;
    }

    public static void main(String[] args) throws IOException {

        sumaParcial sp = new sumaParcial();

        long resultado = sp.sumaSimple(args[0]);

        System.out.println(resultado);
        System.out.flush();
    }


}