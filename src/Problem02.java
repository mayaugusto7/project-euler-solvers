/**
 * Created by MayconRibeiro on 20/12/16.
 *
 * Soma dos numeros pares seq fibonnaci ate 4 milhoes
 */
public class Problem02 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int sum = 0;

        do {
            if (num2 % 2 == 0) {
                sum = sum + num2;
            }
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        } while (num2 < 4000000);

        System.out.println(sum);

        long termos = fibonacciSequence(4000000);

        System.out.print(termos);

    }


    public static long fibonacciSequence(long n) {

        long i = 1;
        long j = 0;
        long t = 0;
        long soma = 0;

        /**
        do {

            t = i + j;
            i = j;
            j = t;

            if (t%2 == 0)
                soma += t;

        }  while (t < 4000000); **/

        while(t < 4000000) {

            t = i + j;
            i = j;
            j = t;

            if (t%2 == 0)
                soma += t;
        }

        return soma;

    }

    // an = a1 + (n – 1) * r
    public static double calcularTermoGeral(int n) {

        double termo = 2 + (n - 1) * 1.6d;

        return calcularPA(termo, n);
    }

    public static double calcularPA(double termo, int n) {

        double soma = 0;

        soma = n * (1 + termo) / 2;

        return soma;
    }

    public static int fibonnaciRecursive(int n) {

        if (n < 2) {
            return n;
        } else {
            return fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2);
        }

    }
}