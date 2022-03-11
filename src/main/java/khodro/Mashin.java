package khodro;

public class Mashin extends Khodro{

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
}
