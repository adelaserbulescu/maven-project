package com.example;
import java.util.*;

public class Masina {
   public String marca;
   public ArrayList<Roata> roti;
   
   public Masina(String marca) {
      this.marca = marca;
      this.roti = new ArrayList<>();
   }
   
   public void adaugaRoata(Roata roata) {
      if(roti.size() == 4) throw new PreaMulteRoti();
      roti.add(roata);
   }
   
   public double calculeazaArieTotala() {
      double arie = 0;
      
      for(Roata r : roti) {
         arie += r.calculeazaArie();
      }
      
      return arie;
   }
 }