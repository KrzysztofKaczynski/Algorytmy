/**
 * Created by wojciechpotocki on 27.04.2018.
 */
public class NativeSearch {
    public void search(String tekst, String wzorzec, boolean wielkoscLiter) {
        int dlugoscWzorca = wzorzec.length();
        int dlugoscTekstu = tekst.length();
        int licznik = 0;
        int licznikWzorca = 0;

        if(!wielkoscLiter) {
            tekst = tekst.toLowerCase();
            wzorzec = wzorzec.toLowerCase();
        }

        System.out.println("Indeks występowania wzorca");

        while(licznik <= dlugoscTekstu - dlugoscWzorca) {
            licznikWzorca = 0;
            while(licznikWzorca < dlugoscWzorca &&
                    wzorzec.charAt(licznikWzorca) == tekst.charAt(licznik+licznikWzorca)){
                licznikWzorca++;
            }
            if(licznikWzorca == dlugoscWzorca) {
                System.out.println(licznik);
            }
            licznik++;
        }
    }
}
