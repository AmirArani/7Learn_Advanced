package khodro.jadid;

import khodro.GearBox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandoqDar;

public class Mashin extends Khodro implements SandoqDar, GearBox {

    public static int tedadeForosh;

    public Mashin(String mark){
            this.mark = mark;
    }

    private boolean ayaDarBazAst;
    private String mark;
    private Ranande ranande;

    public Mashin(String mark, int gonjayeshSandoq, String noeDande) {
        this.mark = mark;
    }

    public Mashin() {}

    void bazKardanDar(){
        ayaDarBazAst = true;
    }

    void bastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHalHarekatAst(){

        protectedMethode();

        return !ayaDarBazAst && ayaRoshanAst;
    }

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandoq() {
        return 100;
    }

    @Override
    public boolean AyaDarHalHarekatAst() {
        return false;
    }

    @Override
    public String getMark() {
        return mark;
    }
}
