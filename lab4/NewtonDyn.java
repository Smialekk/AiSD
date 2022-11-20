package algorytmy4Dynamiczne;

public class NewtonDyn {
    final static int N = 8; //kolumny
    final static int K = 5; //wiersze

    public static void main(String[] args)
    {
        int [][] tab = new int[K+1][N+1];

        for (int n=0; n<=N; n++) //Wypelnianie pierwszego wiersza - K=0
            tab[0][n] = 1;

        for (int k=1; k<=K; k++) //Wypelnianie pozostalych wierszy
            for (int n=k; n<=N; n++) //dla kazdego wiersza wypelnij kolumny
                tab[k][n] = tab[k-1][n-1] + tab[k][n-1];

        System.out.println("Ostateczny wynik to zawsze tab[K][N]");
        System.out.println(tab[K][N]);
        System.out.println("\n");

        System.out.println("Wypelnienie tablicy krok po kroku: ");
        for (int i=0; i<=K; i++) {
            for (int j=0; j<=N; j++) {
                int val = tab[i][j];
                if (val<100) System.out.print(" ");
                if (val<10) System.out.print(" ");
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
}
