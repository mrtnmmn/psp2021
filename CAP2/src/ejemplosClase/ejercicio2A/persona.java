package ejemplosClase.ejercicio2A;

public class persona extends Thread {

    private float peso;
    private ascensor ascensor;
    private int num;

    public persona(int num, float peso, ascensor ascensor) {
        this.num = num;
        this.peso = peso;
        this.ascensor = ascensor;
    }

    public void run() {
        ascensor.sube_persona(num,peso);
        try{
            Thread.sleep((long)Math.floor(Math.random()*500));
        } catch (InterruptedException e) {}
        ascensor.baja_persona(num, peso);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "peso=" + peso +
                ", num=" + num +
                '}';
    }
}