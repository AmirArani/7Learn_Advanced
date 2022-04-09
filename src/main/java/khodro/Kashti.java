package khodro;

import khodro.jadid.Mashin;

public class Kashti extends Khodro{
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
