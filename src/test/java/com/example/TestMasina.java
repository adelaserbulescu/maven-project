package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMasina {
   @Test
   public void limitaRotiTest() {
       Masina m = new Masina("Audi");
       m.adaugaRoata(new Roata(1));
       m.adaugaRoata(new Roata(2));
       m.adaugaRoata(new Roata(3));
       m.adaugaRoata(new Roata(4));
       Assertions.assertThrows(PreaMulteRoti.class, () -> m.adaugaRoata(null));
   }
   
   @Test
   public void ArieTest() {
       Masina m = new Masina("Audi");
       m.adaugaRoata(new Roata(1));
       m.adaugaRoata(new Roata(2));
       m.adaugaRoata(new Roata(3));
       m.adaugaRoata(new Roata(4));
       
       Assertions.assertEquals(94.2, m.calculeazaArieTotala());
   }

}