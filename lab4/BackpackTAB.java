package algorytmy4Dynamiczne;

public class BackpackTAB {

    final static int N = 6;  // przedmioty
    final static int MAX_V = 10; // objetość

    final static int[] V = {6, 2, 3, 2, 3, 1};  // objetości przedmiotow
    final static int[] W = {6, 4, 5, 7, 10, 2}; // wartości przedmiotow

    public static void main(String[] args) {
        int items = V.length;
        int[][] tab = new int[items][MAX_V+1]; //tab[6][11]

        //for odpowiedzialny za pierwszy wiersz
        for (int i = 0; i < MAX_V+1; i++) {
            if (V[0]>i) tab[0][i] = 0; //jesli wartosc przedmiotu mniejsza od nr kolumny wypisz 0
            else tab[0][i] = W[0]; //jesli wieksza wypisz wartosc
        }
        //pozostale wiersze
        for (int i = 1; i < items; i++) {
            for (int j = 0; j < MAX_V+1; j++) {
                if (V[i]>j) tab[i][j] = tab[i-1][j];
                else {
                    tab[i][j] = Math.max(tab[i-1][j], W[i]+tab[i-1][j-V[i]]);
                }
            }
        }
        System.out.println("Najlepsza wartość plecaka to " + tab[items-1][MAX_V] + ".");
        System.out.println("Wypelnienie tablicy krok po kroku: ");
        for (int i=0; i<items; i++) {
            for (int j=0; j<MAX_V+1; j++) {
                int val = tab[i][j];
                if (val<100) System.out.print(" ");
                if (val<10) System.out.print(" ");
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
}

