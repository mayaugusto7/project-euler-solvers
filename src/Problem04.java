import java.util.Scanner;

/**
 * Created by MayconRibeiro on 20/12/16.
 *
 * Maior palindromo entre dois numeros de tres digitos
 *
 *
 */
public class Problem04 {

    public static void main(String[] args) {

        long maior = 0;

        for (int num1 = 100; num1 < 1000; num1++) {
            for(int num2 = num1; num2 < 1000; num2++) {

                long produto = num1 * num2;

                String valorInvertido = inversorDeValor(produto);

                if (isPalindromo(produto, Long.parseLong((valorInvertido)))) {
                    if (produto > maior)
                        maior = produto;
                }
            }
        }

        System.out.print(maior);
    }

    private static boolean isPalindromo(long produto, long valorInvertido) {

            if (produto == valorInvertido) {
                return  true;
            } else {
               return  false;
            }

    }

    private static String inversorDeValor(long produto) {

        String valorInvertido = "";

        String produtoAux = String.valueOf(produto);

        for (int i = produtoAux.length() -1; i >= 0; i--) {
            valorInvertido += produtoAux.charAt(i);
        }

        return valorInvertido;
    }

}