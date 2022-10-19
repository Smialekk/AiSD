package algorytmy1BrutalForce;

public class SpaceCrewEasy {
    public static void main(String[] args) {
        int N = 5;
        int[] tab = new int[N+1];
        int [] rozw = new int[N];
        int minIle = Integer.MAX_VALUE; // lub liczba typu 99999
        int s = (int) Math.pow(2, N);
        for (int l = 0; l < s; l++) {
            int a = tab[0] + tab[3];
            int b = tab[1] + tab[2] + tab[3];
            int c = tab[2] + tab[4];
            int d = tab[0] + tab[1] + tab[4];
            if (a > 0 && b > 0 && c > 0 && d > 0){
                int ile = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                if (minIle > ile){
                    minIle = ile;
                    rozw[0] = tab[0]; rozw[1] = tab[1]; rozw[2] = tab[2]; rozw[3] = tab[3]; rozw[4] = tab[4];
                }
            }
            int i = 0;
            do {
                if (tab[i] == 1){
                    tab[i] = 0;
                    i++;}
                    else {
                        tab[i] = 1; break;
                    }

            } while(true);
        }
        System.out.println("Zabieramy " + minIle + " kosmonautow");
        if(rozw[0] == 1) System.out.println("k1 ");
        if(rozw[1] == 1) System.out.println("k2 ");
        if(rozw[2] == 1) System.out.println("k3 ");
        if(rozw[3] == 1) System.out.println("k4 ");
        if(rozw[4] == 1) System.out.println("k5 ");
    }
}
