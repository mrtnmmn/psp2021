package ejemplosClase.ejercicio2A;

public class ascensor {

    private final float max_peso = 450;
    private final int max_personas = 6;

    private static int numeroPersonas;
    private static float pesoAcumulado;

    public synchronized void baja_persona(int n, float peso) {
        numeroPersonas --;
        pesoAcumulado -= peso;
        System.out.println("Persona: " + n + " baja, peso :" + pesoAcumulado + ", personas: " + numeroPersonas);
        notifyAll();
    }

    public synchronized void sube_persona(int n, float peso) {
        while ((pesoAcumulado + peso) > max_peso || numeroPersonas >= max_personas) {
            try {
                wait();
                System.out.println("Persona: " + n + "espera, peso: " + pesoAcumulado + ", personas: " + numeroPersonas);
            } catch (InterruptedException e) {
                System.out.println("Error en wait");
            }

        }
        numeroPersonas ++;
        pesoAcumulado += peso;

        System.out.println("Persona: " + n + " sube, peso :" + pesoAcumulado + ", personas: " + numeroPersonas);
        notifyAll();
    }
}
