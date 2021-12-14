package ejemplosClase.contador;

public class counter {

    private int c = 0;

    counter(int c) {this.c = c;}

    public void increment() {c += 1;}

    public void decrement() {c -= 1;}

    public int getValor() {return c;}

    @Override
    public String toString() {
        return "counter{" +
                "c=" + c +
                '}';
    }
}
