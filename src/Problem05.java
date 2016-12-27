/**
 * Created by MayconRibeiro on 21/12/16.
 */
public class Problem05 {

    public static void main(String[] args) {

        long menorValor = 999999999999999999L;
        int count = 0;

        for (int i = 1; i <= menorValor; i++) {
            for (int j = 1;  j <= 20; j++) {
                if (i%j == 0) {
                   count++;
                }
            }

            if (count == 20) {
                menorValor = i;
            }

            count = 0;

        }

        System.out.print(menorValor);

    }
}
