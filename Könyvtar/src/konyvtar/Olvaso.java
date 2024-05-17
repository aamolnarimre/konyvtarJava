package konyvtar;

import java.util.ArrayList;

public class Olvaso {

    private String nev;
    private int azon;
    private ArrayList<Konyv> kolcsonzottek; //Nem fogunk tudni elemet tenni,eggyel lejjebb csak
    private Konyvtar konyvtar; //it lát rá az olvasó a könyvtárra

    public Olvaso(String nev, int azon, Konyvtar konyvtar) { //Ezzel
        this.nev = nev;
        this.azon = azon;
        kolcsonzottek = new ArrayList<>();
        this.konyvtar = konyvtar; //És ezzel rálát a könyvtár összes paraméterére az olvasó

    }

    public int kolcsonzottekSzama() {

        return kolcsonzottek.size();
    }

    public void kolcsonzes(String cim) {  //36:20 + konyvtar konyvei getter mind
        for (Konyv konyv : konyvtar.getKonyvek()) { //itt kapott getter-t a konyv az osszeset kijelolve
            if (konyv.getCim().equals(cim)) { //equals ua. ==
                konyvtar.konyvEltavolit(konyv);
               kolcsonzottek.add(konyv); 
                konyv.kolcsonzes(); //adott konyv kolcsonzesenek meghívása
                return;  //ha megtaláltuk kiláp a fügvényből

            }
        }
    }

    public void visszahozas(String cim) { //ua.,mint kolcsonzes, csak fordítva
        for (Konyv konyv : kolcsonzottek) {
            if (konyv.getCim().equals(cim)) {
                konyvtar.konyvHozzaad(konyv);
                kolcsonzottek.remove(konyv);
                konyv.kolcsonzes();
                return;
            }
        }
    }

    public String getNev() {
        return nev;
    }

    public int getAzon() {
        return azon;
    }

    public ArrayList<Konyv> getKolcsonzottek() {
        return kolcsonzottek;
    }

    public Konyvtar getKonyvtar() {
        return konyvtar;
    }
    
    
    
    
}
