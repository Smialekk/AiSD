package algorytmy5Zachlanne;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int[] L = {4, 5, 12, 7, 4, 8, 3, 0, 5}; // max 47.30 zl
        int zl, gr, r, i = 0;
        int[] zliczaj = new int[M.length]; // zliczanie wydanych monet

        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        zl = input.nextInt();
        System.out.print("groszy: ");
        gr = input.nextInt();
        System.out.print("Reszta: ");
        r = zl * 100 + gr;

        for(i=0; i<M.length; i++){ //dany nominal
            for(int j=0; j<L[i]; j++){ // ilosc danego nominalu
                if (r-M[i] >= 0){ //jesli miesci sie nominal
                    zliczaj[i]++;//zlicz
                    r = r - M[i];//odejmij nominal od reszty
                }
            }
        }

        System.out.println("\n\nLiczba wydanych poszczególnych monet");
        System.out.println(Arrays.toString(zliczaj));
        System.out.println("Nominal  liczba monet");
        for(int j = 0; j < M.length; j++){
            System.out.println((double)M[j]/100 +" \t\t"+ zliczaj[j]);
        }
        if (r==0) System.out.println("Cala reszta zostala wydana.");
        else System.out.println("Do wydania pelnej reszty zabraklo " + (double)r/100 + " zl.");

    }
}
