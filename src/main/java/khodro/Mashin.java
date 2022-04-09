package khodro;

public class Mashin extends Khodro implements SandoqDar, GearBox{

    public Mashin(String mark){
            this.mark = mark;
    }

    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;

    int gonjayeshSandoq;
    String noeDande;

    public Mashin(String mark, int gonjayeshSandoq, String noeDande) {
        this.mark = mark;
        this.gonjayeshSandoq = gonjayeshSandoq;
        this.noeDande = noeDande;
    }

    void bazKardanDar(){
            ayaDarBazAst = true;
        }

        void bastanDar(){
            ayaDarBazAst = false;
        }

        public boolean ayaDarHalHarekatAst(){
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
    public String getMark() {
        return mark;
    }
}
