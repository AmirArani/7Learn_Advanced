package mashin;

import static java.lang.System.out;

public class Mashin {

        // Constructor
        // dont have return value
        // same name as class
        public Mashin(){
            out.println("yek mashin saxte shod");
        }

        public Mashin(String mark){
            this.mark = mark;
            out.println("yek mashin saxte shod ba mark: "+mark);
        }

        // Dade:
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String mark;
        Ranande ranande;


        // Tabe (Methode):
        public void roshan(){
            ayaMashinRoshanAst = true;
            out.println("mashin roshan ast!");
        }

        void khamoush(){
            ayaMashinRoshanAst = false;
            out.println("mashin khamoush ast!");
        }

        void bazKardanDar(){
            ayaDarMashinBazAst = true;
            out.println("dar baz ast!");
        }

        void bastanDar(){
            ayaDarMashinBazAst = false;
            out.println("dar baste ast!");
        }

        public boolean ayaMashinDarHalHarekatAst(){
            // dar baste va mashin roshan bashad (RULE)
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println("mashin dar hal harekat ast!");
                return true;
            }else{
                out.println("mashin park ast!");
                return false;
            }
        }


}
