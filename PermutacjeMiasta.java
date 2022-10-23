package algorytmy2GeniTest;

public class PermutacjeMiasta {
    static int[][] miasto = {
            {0, 300, 402, 350, -1, -1, -1, -1, -1},
            {300, 0, -1, -1, 440, 474, -1, -1, -1},
            {402, -1, 0, -1, -1, 330, -1, -1, -1},
            {365, -1, -1, 0, -1, -1, 823, -1, -1},
            {-1, 440, -1, -1, 0 ,-1 ,-1 ,430, -1},
            {-1, 474, 330, -1, -1, 0, 813, 365, 774},
            {-1, -1, -1, 823, -1, 812, 0, -1, 403},
            {-1, -1, -1, -1, 430, 365, -1, 0, 768},
            {-1, -1, -1, -1, -1, 774, 403, 768, 0},
    };
    final static int N = 9;
    static int sumaKM;
    static String[] przystanki = {"Warszawa", "Katowice", "Zakopane", "Lwów", "Wiedeń", "Budapeszt",
            "Bukareszt", "Zagrzeb", "Sofia"};
    static String droga= " ";
    static String najlepszaDroga =" ";
    static int najkrotszaDroga = Integer.MAX_VALUE;
    static String wynik = " ";
    private static int[] L = new int[N];
    public static void main(String[] args)
    {
        permutacje(0);
        System.out.println(wynik);
    }
    static void permutacje(int i)
    {
        if (i == N) {
            if (L[0] - 1 == 0) {
                for (int j = 0; j < N - 1; j++)
                {
                    if (miasto[L[j] - 1][L[j + 1] - 1] != -1)
                    {
                        if (L[j] - 1 != 8)
                        {
                            droga += przystanki[L[j]-1]+" ,";
                            sumaKM += miasto[L[j] - 1][L[j + 1] - 1];
                        }else {
                            droga += przystanki[L[j]-1];
                            break;
                        }
                    } else {
                        sumaKM = 0;
                        break;
                    }
                }
                if(sumaKM !=0 && sumaKM < najkrotszaDroga)
                {
                    najlepszaDroga = droga;
                    najkrotszaDroga = sumaKM;
                }
                sumaKM = 0;
                droga = " ";
            }
        }
        else {
            for(int j = 1; j <= N; j++)
            {
                int k;
                for(k = 0; k < i; k++)
                {
                    if (L[k] == j) break;
                }
                if (k == i)
                {
                    L[k] = j;
                    permutacje(i+1);
                }
            }
        }
        wynik = "Najkrótsza droga zajmie: "+ najkrotszaDroga +" km, a przystanki na: "+ najlepszaDroga;
    }
}

