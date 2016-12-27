/**
 * Created by MayconRibeiro on 21/12/16.
 */
public class Problem07 {

    public static void main(String[] args) {

        int count = 0;
        int number = 1;

        for (int i = 2; i <= 110000; i++) {

            for(int j = 1; j <= i; j++) {

                if (i%j == 0) {
                    count++;
                }

            }

            if (count <= 2 ) {
                System.out.println("["+ number + "] : " + i);
                number++;
            }

            count = 0;

        }

    }

}
