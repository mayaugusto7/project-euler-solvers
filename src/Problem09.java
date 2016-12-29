/**
 * Created by MayconRibeiro on 21/12/16.
 */
public class Problem09 {

    public static void main(String[] args) {

        double a = 3;
        double b = 5;
        double c = 0;

        c = Math.pow(a, 2) + Math.pow(b, 2);

        if (c == 25) {
            c  = Math.sqrt(c);
        }

        System.out.print(c);

    }

}
