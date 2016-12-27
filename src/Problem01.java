/**
 * Created by MayconRibeiro on 20/12/16.
 *
 * Soma dos multiplos de 3 e 5 ate 1000
 */
public class Problem01 {

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 0; i < 1000; i++) {

            if (i%3 == 0 || i%5 == 0) {
                soma += i;
            }

        }

        System.out.println(soma);

    }

}
