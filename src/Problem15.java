/**
 * Created by MayconRibeiro on 06/01/17.
 */
public class Problem15 {

    public static void main(String[] args) {

        int[][] matriz = new int[2][2];
        int[][] matrizAux = matriz;
        int min = 0;

        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {

                    min = matriz[i][j];

                    for (int k = 0; k < matriz.length; k++) {
                        if (matriz[i][k] + matrizAux[k][j] < min) {
                            min = matriz[i][k] + matrizAux[k][j];
                        }

                        matriz[i][j] = min;
                    }
                }
            }
        }

        System.out.print(min);
        printMatriz(matriz);
    }


    public static void printMatriz(int[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("%4d", matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
