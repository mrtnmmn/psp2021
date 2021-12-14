package ejemplosClase.parking;

import ejemplosClase.ejercicio2A.persona;

import java.util.ArrayList;
import java.util.Collections;

public class test {

    public static void main(String[] args) {
        new test();
    }

    public test() {
        ArrayList<coche> listaCoches = new ArrayList<>();

        parking p = new parking();

        for(int i = 0; i < 100; i++) {
            coche c = new coche(p, i);
            c.start();
            listaCoches.add(c);
        }

        for (coche c : listaCoches) {
            try {
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("fin de la simulacion");

        int tiempoTotal = 0;
        int tMax = 0;

        for (coche c : listaCoches) {
            tiempoTotal += c.tiempo;
        }

        Collections.sort(listaCoches);

        System.out.println("tiempo total: " + tiempoTotal);

        System.out.println("ANALISIS:");
        for (coche c: listaCoches) {
            System.out.println(c.toString());
        }
    }


}
