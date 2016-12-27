/**
 * Created by MayconRibeiro on 20/12/16.
 *
 * Maior fator primo
 * do numero 600851475143
 *
 *
 */
public class Problem03 {

    public static void main(String[] args) {

        long num = 600851475143L;
        long largestFact = 0;

        for (long i = 2; i < num; i++) {

            if(num%i == 0) {
                boolean isPrime = true;

                for (long j = 2; j < i; j++) {
                    if(i%j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) {
                    largestFact = i;
                }

            }

        }

        System.out.print(largestFact);
    }


}