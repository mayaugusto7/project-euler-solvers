/**
 * Created by MayconRibeiro on 21/12/16.
 */
public class Problem06 {

    public static void main(String[] args) {

        long totalQuadradoNumerosNaturais =  somaDoQuadradoNumerosNaturais(100);
        long totalQuandroDaSoma = oQuadradoDaSoma(100);

        long produto = totalQuandroDaSoma - totalQuadradoNumerosNaturais;

        System.out.print(produto);
    }

    public static long somaDoQuadradoNumerosNaturais(long tamanho) {

        long somaTotal = 0;

        for (int i = 1; i <= tamanho; i++) {
           somaTotal += Math.pow(i, 2);
        }

        return somaTotal;
    }

    public static long oQuadradoDaSoma(long tamanho) {

        long somaTotal = 0;

        for (int i = 1; i <= tamanho; i++) {
            somaTotal += i;
        }

        return (long) Math.pow(somaTotal, 2);
    }
}
