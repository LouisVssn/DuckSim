package com.company;

public class Main {

    public static void main(String[] args) {
      Gleitente gleitente = new Gleitente(new Quietschen(), new Gleiten());
      gleitente.fliegenAusfuehren();
      gleitente.quakAusfuehren();
      gleitente.setQuakArt(new Quacken());
      gleitente.quakAusfuehren();
    }
}
