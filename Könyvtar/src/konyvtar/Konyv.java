/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konyvtar;

public class Konyv {
    private String cim,szerzo;
    private int ISBN, kiadasiEv;
    private boolean kolcsonzott;
    
    private Zsaner zsaner;

    public Konyv(String cim, String szerzo, int ISBN, int kiadasiEv, Zsaner zsaner) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ISBN = ISBN;
        this.kiadasiEv = kiadasiEv;
        this.zsaner = zsaner;
        
        this.kolcsonzott = false;
    }
    
    
    public  void kolcsonzes(){ //38:15
       /* if (kolcsonzott) {
            kolcsonzott = false;
            
        }else{
            kolcsonzott = true;
        } */
       kolcsonzott = !kolcsonzott;
    }
 
    
      /* public void visszavetel(Olvaso o){
        
    }*/ 

    public void setKolcsonzott(boolean kolcsonzott) {
        this.kolcsonzott = kolcsonzott;
    }
//EZ csak akkpr kell , ha a fentebb kikommenteltet használom

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public boolean isKolcsonzott() {
        return kolcsonzott;
    }

    public Zsaner getZsaner() {
        return zsaner;
    }

    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + ", szerzo=" + szerzo + ", ISBN=" + ISBN + ", kiadasiEv=" + kiadasiEv + ", kolcsonzott=" + kolcsonzott + ", zsaner=" + zsaner + '}';
    }
       
}

        
            