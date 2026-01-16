package com.example;

public class Main {
    public static void main(String[] args) {
       Roata r1 = new Roata(1);
       Roata r2 = new Roata(2);
       Roata r3 = new Roata(3);
       Roata r4 = new Roata(4);
       
       Masina m = new Masina("Audi");
       m.adaugaRoata(r1);
       m.adaugaRoata(r2);
       m.adaugaRoata(r3);
       m.adaugaRoata(r4);
       
       m.calculeazaArieTotala();
    }
 }  
