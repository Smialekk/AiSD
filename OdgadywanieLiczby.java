package algorytmy3DzieliZwyciezaj;

import java.util.Random;

public class OdgadywanieLiczby {
    static int a = 0; //min
    static int b = 1000; //max
    static Random generator = new Random(); //f losujaca
    final static int wylosowana = generator.nextInt(b+1);//wylosowana liczba
    static int l = 0; //licznik

    public static void main(String[] args) {
        System.out.println("Wylosowana liczba to "+ wylosowana);
        zgaduje(a, b, (a+b)/2);
    }

    private static void zgaduje(int a, int b, int typ) {
        l++;
        System.out.println("Sprawdzam czy "+ typ +" to wylosowana liczba");
        if (typ==wylosowana)
            System.out.println("Udało mi sie odgadnac liczbe za "+ l +" razem, a była to liczba "+wylosowana+" Super zabawa dla procesora");
        if (typ>wylosowana){
            System.out.println("Szukana liczba jest za duża");
            zgaduje(a,typ,(a+typ)/2); // zgauje od min do typu/2
        }
        if (typ<wylosowana){
            System.out.println("Szukana liczba jest za mała");
            zgaduje(typ,b,(typ+b)/2);// zgauje od typu do max/2
        }
    }
}
