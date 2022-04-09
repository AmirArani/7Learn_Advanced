package khodro;

public abstract class Khodro {

    protected void protectedMethode(){
        System.out.println("This method is protected");
    }

    protected boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }

    void khamoush(){
        ayaRoshanAst = false;
    }

    public abstract boolean AyaDarHalHarekatAst();

    public abstract String getMark();

}
