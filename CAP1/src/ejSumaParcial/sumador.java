package ejSumaParcial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sumador {

    public int sumar (String f) throws IOException {

        int suma = 0;
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String linea;

        while ((linea = br.readLine()) != null) {
            int n = Integer.parseInt(linea);
            suma += n;
        }

        fr.close();
        br.close();

        return suma;

    }

    public static void main(String[] args) throws IOException {

        sumador s = new sumador();

        int res = s.sumar(args[0]);

        System.out.println(res);
    }
}
