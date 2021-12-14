package ejemplosClase.ejercicio2A;

import java.util.ArrayList;

public class simulation {

    public static void main(String[] args) {
        new simulation();
    }

    public simulation() {
        ArrayList<persona> listaPersonas = new ArrayList<>();

        ascensor asc = new ascensor();

        for(int i = 0; i < 10; i++) {
            persona person = new persona(i, (float) (Math.random()*50 + 50), asc);
            person.start();
            listaPersonas.add(person);
        }

        for (persona p : listaPersonas) {
            try {
                p.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fin de la simulacion");


    }
}
