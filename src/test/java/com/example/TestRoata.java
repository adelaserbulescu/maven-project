package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRoata {
   @Test
   public void testArie() {
     Roata r = new Roata(2);
     Assertions.assertEquals(12.56, r.calculeazaArie());
   }
}