package khodro;

public class Mashin {

        public Mashin(){}

        public Mashin(String mark){
            this.mark = mark;
        }

        boolean ayaRoshanAst;
        boolean ayaDarBazAst;
        String mark;
        Ranande ranande;


        public void roshan(){
            ayaRoshanAst = true;
        }

        void khamoush(){
            ayaRoshanAst = false;
        }

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
