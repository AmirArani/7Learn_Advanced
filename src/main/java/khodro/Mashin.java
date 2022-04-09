package khodro;

public class Mashin extends Khodro implements SandoqDar, GearBox{

        public Mashin(){}

        public Mashin(String mark){
            this.mark = mark;
        }

        boolean ayaDarBazAst;
        String mark;
        Ranande ranande;

        void bazKardanDar(){
            ayaDarBazAst = true;
        }

        void bastanDar(){
            ayaDarBazAst = false;
        }

        public boolean ayaDarHalHarekatAst(){
            if(!ayaDarBazAst && ayaRoshanAst){
                return true;
            }else{
                return false;
            }
        }

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandoq() {
        return 100;
    }
}
