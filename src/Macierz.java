import java.util.concurrent.ThreadLocalRandom;

public class Macierz {
    public static void main(String[] args) {
        int M = 4; // rozmiar macierzy
        int[][] macierz1 = new int[M][M];
        int[][] macierz2 = new int[M][M];
        Generator_wartosci(macierz1,M);
        Generator_wartosci(macierz2,M);

        // wykonuje operacje
        int[][] macierz_dodawanie = Sumowanie(macierz1, macierz2, M); // macierz z wynikiem dodawania
        int[][] macierz_mnozenie = Mnozenie(macierz1,macierz2,M); // macierz z wynikiem mnożenia

        // zwracam macierze
        Print(macierz1,M);
        Print(macierz2,M);
        Print(macierz_dodawanie,M);
        Print(macierz_mnozenie,M);


    }
    public static void Generator_wartosci(int[][] macierz, int M) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                macierz[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
            }
        }
    }
    public static int[][] Sumowanie(int[][] macierz1, int[][] macierz2, int M) {
        int[][] macierz_dodawanie = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                macierz_dodawanie[i][j] = macierz1[i][j] + macierz2[i][j];
            }
        }
        return macierz_dodawanie;
    }

    public static int[][] Mnozenie(int[][] macierz1, int[][] macierz2, int M) {
        int[][] macierz_mnozenie = new int[M][M]; // https://www.mathsisfun.com/algebra/matrix-multiplying.html
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < M; k++) {
                    macierz_mnozenie[i][j] += macierz1[i][k] * macierz2[k][j];
                }
            }
        }
        return macierz_mnozenie;
    }

    public static void Print(int[][] macierz, int M) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
