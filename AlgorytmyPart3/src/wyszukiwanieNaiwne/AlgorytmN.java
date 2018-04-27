package wyszukiwanieNaiwne;

public class AlgorytmN {

    public static void main(String[] args) {

        String wzorzec;
        String tekst;
        int m,n,i,j;
        System.out.println("Podaj tekst");
        tekst = Console.readString("?");
        System.out.println("Podaj wzorzec");
        wzorzec = Console.readString("?");
        n = tekst.length();
        m = wzorzec.length();
        System.out.println("Indeksy wystapien wzorca w tekscie");
        i=0;
        while (i<=n-m)
        {
            j=0;
            while ((j<m) &&
                    (wzorzec.charAt(j) == tekst.charAt(i+j))) {
                j++;
            }
            if (j==m) {
                System.out.println(i+1);
            }
            i++;
        }
    }
}
