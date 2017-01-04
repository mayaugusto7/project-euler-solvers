/**
 * Created by MayconRibeiro on 02/01/17.
 */
public class PrimosThread implements Runnable {

    private long minValor = 0;
    private long maxValor = 0;
    private long soma = 0;

    public PrimosThread(long minValor, long maxValor) {
        this.minValor = minValor;
        this.maxValor = maxValor;
    }

    public long getSoma() {
        return soma;
    }

    public void setSoma(long soma) {
        this.soma = soma;
    }

    @Override
    public void run() {

        int count = 0;
        long somaLocal = 0;

        synchronized (this) {

            for (long i = this.minValor; i < this.maxValor; i++) {

                for (long j = 1; j <= i; j++) {

                    if (i%j == 0) {
                        count++;
                    }

                }

                if (count == 2) {
                    somaLocal += i;
                    System.out.println(i);
                }

                count = 0;
            }

            System.out.print(somaLocal);

            setSoma(somaLocal);
        }

    }
}
