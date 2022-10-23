package algorytmy2GeniTest;

import java.util.Arrays;

public class PermutacjeLody {
    static int tab[][] =
            {{0,7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}};
    final static int N = 6;
    private static int[] L = new int[N];
    static String kolejnosc = "";
    static int bestTime = Integer.MAX_VALUE;
    static String answer= "";

    public static void main(String[] args) {

        permutacje(0);
        System.out.println(answer);
    }
    static void permutacje(int i) {
        answer = "";
        int start = 0;
        int suma = 0;
        String odp = "";
        if (i == N)
        {
            for (int j = 0; j < N-1; j++)
            {
                start = tab[L[j+1]-1][L[0]-1];
                suma+=tab[L[j]-1][L[j+1]-1];
            }
            suma+=start;
            if(suma<bestTime)
            {
                for (int j = 0; j < N; j++)
                {
                    odp += String.valueOf(L[j])+", ";
                }
                odp += String.valueOf(L[0]);
                bestTime=suma;
                kolejnosc = odp;
            }
        }
        else
        {
            for (int j = 1; j <= N; j++)
            {
                int k;
                for (k = 0; k < i; k++)
                {
                    if (L[k] == j)
                    {
                        break;
                    }
                }
                if (k == i)
                {
                    L[k] = j;
                    permutacje(i + 1);
                }
            }
        }
        answer = "Najlepszy czas przestrojenia wynosi: "+bestTime+" oraz najlepsza kolejnosc wytwarzania smakow to np: "+kolejnosc;
    }
}
