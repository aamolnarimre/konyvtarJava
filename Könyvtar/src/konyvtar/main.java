/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konyvtar;



public class main {
    
    public static void main(String[] args) {
        
        Konyvtar k = new Konyvtar();
        k.konyvHozzaad(new Konyv("a", "a1", 5, 2020, Zsaner.ROMANTIKUS)); // így hivatkozunk az enumokra
        k.konyvHozzaad(new Konyv("b", "b1", 1, 2022, Zsaner.IFJUSAGI));
        k.konyvHozzaad(new Konyv("c", "c1", 2, 2021, Zsaner.SCIFI));
        k.konyvHozzaad(new Konyv("d", "d1", 3, 2023, Zsaner.SZEPIRODALMI));
        k.konyvHozzaad(new Konyv("e", "e1", 4, 2024, Zsaner.ROMANTIKUS));
        
        k.olvasoHozzad(new  Olvaso("Sanyi", 1, k));
        k.olvasoHozzad(new  Olvaso("Sanyi", 1, k));
        k.olvasoHozzad(new  Olvaso("Sanyi", 1, k));
        
        System.out.println(k.getKonyvek().size());
        System.out.println(k.getOlvasok().size());
        
        k.getOlvasok().get(0).kolcsonzes("a");
        System.out.println(k.getKonyvek());
        System.out.println(k.getOlvasok().get(0).kolcsonzottekSzama());
        System.out.println(k.getOlvasok().get(0).getKolcsonzottek().getFirst().isKolcsonzott());
   //48:17
    }
}
