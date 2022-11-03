import java.util.concurrent.ThreadLocalRandom;

public class Tablica_jednowymiarowa {
    public static void main(String[] args) {
        int N = 10;
        int K = 1000;
        if (N >= K) {System.out.println("N nie jest mniejsze od K"); System.exit(1);}
        if (N <= 0) {System.out.println("N nie jest większe od 0"); System.exit(1);}
        if (N > 500000000) {System.out.println("N jest za duże"); System.exit(1);}
        if (K > 2140000000) {System.out.println("K jest za duże"); System.exit(1);}
        // wartości maksymalne według ograniczeń typu int i tablicy (out of memory error)
        int[] tablica = new int[N];
        przypisz_wartosci(tablica,N,K);
        System.out.print("Maksymalna wartość tablicy: " + Maks_wartosc(tablica, N) + "\n");
        System.out.print("Minimalna wartość tablicy: " + Min_wartosc(tablica, N) + "\n");
        Print_w_kolejnosci(tablica,N);
        Print_w_odwrotnej_kolejnosci(tablica,N);
        Parzyste(tablica,N);
        Nieparzyste(tablica,N);
    }
    public static void przypisz_wartosci(int[] tablica, int N, int K) {
        for (int i = 0; i < N; i++) { // Generowanie losowych wartości dla tablicy
            tablica[i] = ThreadLocalRandom.current().nextInt(1, K+1);
        }
    }

    public static int Maks_wartosc(int[] tablica,int N) {
        int max = tablica[0];
        for (int i = 0; i < N; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }}
        return max;
    }
    public static int Min_wartosc(int[] tablica,int N) {
        int min = tablica[0];
        for (int i = 0; i < N; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }}
        return min;
    }
    public static void Print_w_kolejnosci(int[] tablica,int N) {
        System.out.print("Elementy w kolejności zapisywania"+ "\n");
        for (int i = 0; i < N; i++) { // wyświetlenie wartości tablicy w kolejności zapisywania
            System.out.print(tablica[i]+ "\n");
        }
    }
    public static void Print_w_odwrotnej_kolejnosci(int[] tablica,int N) {
        System.out.print("Elementy w kolejności odwrotnej"+ "\n");
        for (int i = 0; i < N; i++) { // wyświetlenie wartości tablicy w kolejności odwrotnej do zapisywania
            System.out.print(tablica[N-1-i]+ "\n");
        }
    }

    public static void Parzyste(int[] tablica,int N) {
        int N_parzyste = 0;
        for (int i = 0; i < N; i++) {
            if (tablica[i] % 2 == 0) {
                N_parzyste++;
            }}
        if (N_parzyste == 0) {System.out.println("Brak liczb parzystych"); return;}
        int[] tab_parzyste = new int[N_parzyste];
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (tablica[i] % 2 == 0) {
                tab_parzyste[j] = tablica[i];
                j++;
            }
        }
        System.out.print("Elementy parzyste: "+ "\n");
        for (int i = 0; i < N_parzyste; i++) {
            System.out.print(tab_parzyste[i]+ "\n");
        }
    }

    public static void Nieparzyste(int[] tablica,int N) {
        int N_nieparzyste = 0;
        for (int i = 0; i < N; i++) {
            if (tablica[i] % 2 != 0) {
                N_nieparzyste++;
            }}
            if (N_nieparzyste == 0) {System.out.println("Brak liczb nieparzystych"); return;}
            int[] tab_nieparzyste = new int[N_nieparzyste];
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (tablica[i] % 2 != 0) {
                tab_nieparzyste[j] = tablica[i];
                j++;
            }
        }
        System.out.print("Elementy nieparzyste: "+ "\n");
        for (int i = 0; i < N_nieparzyste; i++) {
            System.out.print(tab_nieparzyste[i]+ "\n");
        }
    }
}