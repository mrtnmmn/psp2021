
package suma1000;

public class sumador {

    private long sumar(long n1, long n2) {
        long resultado = 0;
        for (long i = n1; i <= n2; i++){
            resultado = resultado + i;
        }
        return resultado;
    }

    public static void main(String[] args) {

        sumador s = new sumador();

        long n1 = Integer.parseInt(args[0]);
        long n2 = Integer.parseInt(args[1]);

        long resultado = s.sumar(n1, n2);
        System.out.println(resultado);
    }

}
