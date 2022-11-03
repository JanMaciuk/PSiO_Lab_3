import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int N = 5;
        int K = N-1;
        int[] tablica = new int[N];
        int rand1 = ThreadLocalRandom.current().nextInt(1, K + 1);
        int rand2 = ThreadLocalRandom.current().nextInt(1, K + 1);
        // if we don't know the value of N, use a while loop to generate values for tablica


    }
}