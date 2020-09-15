package com.company;

public class Ente{

  Quakverhalten quakArt;
  Flugverhalten flugEigenschaft;

  Ente(){
    this.quakArt = new Quacken();
    this.flugEigenschaft = new Fliegen();

  }

  Ente(Quakverhalten quakArt, Flugverhalten flugEigenschaft){
    this.quakArt = quakArt;
    this.flugEigenschaft = flugEigenschaft;
  }

  void setFlugverhalten(Flugverhalten fv){
    flugEigenschaft = fv;
  }

  void setQuakArt(Quakverhalten quakArt){
    this.quakArt = quakArt;
  }

  void fliegenAusfuehren(){

    flugEigenschaft.fliegen();
  }

  void quakAusfuehren(){
    quakArt.quaken();
  }
}
