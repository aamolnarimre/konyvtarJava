/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package konyvtar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class OlvasoTest {
    
    public OlvasoTest() {
    }

    /**
     * Test of kolcsonzottekSzama method, of class Olvaso.
     */
    @Test
    public void testKolcsonzottekSzama() {
        Konyvtar k = new Konyvtar();
        Olvaso o = new Olvaso("asd", 0,k); //létr krll hozni új olvasót, de előtte kell neki egy új könyvtár
        o.kolcsonzes("asd");
        assertEquals(0, o.kolcsonzottekSzama());
        
        k.konyvHozzaad(new Konyv("asd", "asd", 0, 0, Zsaner.SCIFI));
        o.kolcsonzes("asd");
        assertEquals(1, o.getKolcsonzottek().size());
        /*assertEquals(0, k.getKonyvek().size());
        assertTrue(o.getKolcsonzottek().get(0).isKolcsonzott());*/ //Ezeket nem kérte a feladat
    }

    /**
     * Test of kolcsonzes method, of class Olvaso.
     */
    @Test
    public void testKolcsonzes() {
        Konyvtar k = new Konyvtar();
        Olvaso o = new Olvaso("asd", 0,k);
        o.kolcsonzes("asd");
        assertEquals(0,o.getKolcsonzottek().size());
        
        k.konyvHozzaad(new Konyv("asd", "asd", 0, 0, Zsaner.SCIFI));
        o.kolcsonzes("asd");
        assertEquals(1, o.getKolcsonzottek().size());
        assertEquals(0, k.getKonyvek().size());
        assertTrue(o.getKolcsonzottek().get(0).isKolcsonzott());
    }

    /**
     * Test of visszahozas method, of class Olvaso.
     */
    @Test
    public void testVisszahozas() {
        Konyvtar k = new Konyvtar();
        Olvaso o = new Olvaso("asd", 0,k);
        
        Konyv konyv = new Konyv("asd", "asd", 0, 0, Zsaner.SCIFI); //Ezelőtt setter Konyv.java kolcsonzottre
        konyv.setKolcsonzott(true);
        o.getKolcsonzottek().add(konyv);
        
        o.visszahozas("asd");
        
        assertEquals(0, o.getKolcsonzottek().size());
        assertEquals(1, k.getKonyvek().size());
       // assertFalse(k.getKonyvek().get(0).isKolcsonzott());    
    }

    /**
     * Test of getNev method, of class Olvaso.
     */
    @Test
    public void testGetNev() {
    }

    /**
     * Test of getAzon method, of class Olvaso.
     */
    @Test
    public void testGetAzon() {
    }

    /**
     * Test of getKolcsonzottek method, of class Olvaso.
     */
    @Test
    public void testGetKolcsonzottek() {
    }

    /**
     * Test of getKonyvtar method, of class Olvaso.
     */
    @Test
    public void testGetKonyvtar() {
    }
    
}
