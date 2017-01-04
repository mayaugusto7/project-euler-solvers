import java.math.BigInteger;

/**
 * Created by MayconRibeiro on 21/12/16.
 */
public class Problem10 {

    private static final long LIMIT = 2000000;

    public static void main(String[] args) {

        BigInteger sum = new BigInteger("2");

        boolean isPrime = true;

        for (int i = 3; i < LIMIT; i++) {

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

