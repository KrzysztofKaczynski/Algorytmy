package wyszukiwanieNaiwne1;

public class AlgNaiw {
    public static void main(String[] args) {
        String wzorzec = new String();
        String tekst = new String();
        boolean wielkośćLiter = true;
        int m,n;
        n = tekst.length();
        m = wzorzec.length();
        System.out.println("Indeksy wystapien wzorca w tekscie");
        int licznik = 0;
        int licznikWzorca = 0;
       if (!wielkośćLiter){
           tekst = tekst.toLowerCase();
           wzorzec = wzorzec.toLowerCase();
       }
        while (licznik <= n-m)
        {
            licznikWzorca=0;
            while ((licznikWzorca<m) &&
                    (wzorzec.charAt(licznikWzorca) == tekst.charAt(licznik+licznikWzorca))) {
                licznikWzorca++;
            }
            if (licznikWzorca==m) {
                System.out.println(licznik+1);
            }
            licznik++;
        }
    }
}




