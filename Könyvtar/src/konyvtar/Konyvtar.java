
package konyvtar;

import java.util.ArrayList;


public class Konyvtar {

    
 
private ArrayList<Konyv> konyvek;
private ArrayList<Olvaso> olvasok;

    public Konyvtar() { //44:33 elfelejtett konstruktort a könyvtárnak
        this.konyvek = new ArrayList<>();
        this.olvasok = new ArrayList<>();
    }



    public void konyvHozzaad(Konyv k){
    konyvek.add(k);
}

    public void konyvEltavolit(Konyv k){
    konyvek.remove(k);
}

public void olvasoHozzad(Olvaso o){
    olvasok.add(o);
}

public void olvasoEltavolit(Olvaso o){
     olvasok.remove(o);
}

    public ArrayList<Konyv> getKonyvek() {
        return konyvek;
    }

    public ArrayList<Olvaso> getOlvasok() {
        return olvasok;
    }

 

  

 
 

    

}
