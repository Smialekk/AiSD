public class brutalnaSilaZbiory {
    
    //metoda latwiejsza
    
    public static void main(String[] args)
    {
        int b1,b2,b3,b4;
        for (b1 = 0; b1 <= 1; b1++)
            for (b2 = 0; b2 <= 1; b2++)
                for (b3 = 0; b3 <= 1; b3++)
                    for (b4 = 0; b4 <= 1; b4++)
                    {
                        System.out.print("{ ");
                        if (b1 == 1) System.out.print("1 ");
                        if (b2 == 1) System.out.print("2 ");
                        if (b3 == 1) System.out.print("3 ");
                        if (b4 == 1) System.out.print("4 ");
                        System.out.println("}");
                    }
    }
    
        //metoda trudniejsza
    
        final int N = 3; // moc zbioru
        int[] tab = new int[N+1];
        int s = (int)Math.pow(2,N);
        for (int l = 0; l < s; l++)
        {
            System.out.print("{ ");
            for (int i = 0; i < N; i++)
                if (tab[i] == 1) System.out.print(i+1 + " ");
            System.out.println("}");
            int i = 0;
            do
            {
                if (tab[i] == 1)
                {
                    tab[i] = 0;
                    i++;
                }
                else
                {
                    tab[i] = 1;
                    break;
                }
            } while (true);
        }
        
        
    
    
}
