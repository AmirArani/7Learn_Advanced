package khodro;

public class Motor extends Khodro {

    public boolean ayaDarHalHarekatAst() {
        return ayaRoshanAst;
    }

    @Override
    public boolean AyaDarHalHarekatAst() {
        return false;
    }

    @Override
    public String getMark() {
        return "Motor";
    }
}
