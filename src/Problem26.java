
/**
 * Created by MayconRibeiro on 04/01/17.
 */
public class Problem26 {

    public static void main(String[] args) {

        int resultado;
        double valor = 0;

        for (int i = 1; i < 1000; i++) {
            valor = (double) 1 / i;
            resultado = (int) Math.round((valor - (int) valor) * 100);
            System.out.println(resultado);
        }

    }
}
