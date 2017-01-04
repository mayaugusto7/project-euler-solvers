import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MayconRibeiro on 21/12/16.
 */
public class Problem10 {

    private static final long LIMIT = 2000000;

    private static long total = 0;

    public static void main(String[] args) {

       /**
       long inicio = 0;
       long fim = 200;

       Thread[] threads = new Thread[10000];

       for (int i = 0; i < threads.length; i++) {

           PrimosThread primosThread = new PrimosThread(inicio, fim);
           threads[i] = new Thread(primosThread);
           threads[i].start();

           total += primosThread.getSoma();
           inicio = fim + 1;
           fim += 200;
       }

        System.out.println("Total soma primos até 2 milhões " + total); **/


        BigInteger sum = new BigInteger("2");

        boolean isPrime = true;

        for (int i = 3; i < 2000000; i++) {

            double aa = Math.sqrt((double)i);
            
            for (int j=2; j <= aa; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                sum = sum.add(BigInteger.valueOf(i));
            }

            isPrime = true;
        }

        System.out.println("Sum  = " + sum);

    }

}

