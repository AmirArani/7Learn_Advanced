package khodro;

import khodro.jadid.Mashin;

public class Kashti extends Khodro{

    @Override
    protected void protectedMethode(){
        System.out.println("We are in Kashti Class");
    }

    @Override
    public boolean AyaDarHalHarekatAst() {
        Mashin mashin = new Mashin();
//        mashin.noeDande = "madf";
        return false;
    }

    @Override
    public String getMark() {
        return "Keshti";
    }
}
