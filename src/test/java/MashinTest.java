import static java.lang.System.*;

public class MashinTest {

    class Mashin{

        // Dade:
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;


        // Tabe (Methode):
        void roshan(){
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

        void harekat(){
            // dar baste va mashin roshan bashad (RULE)
            if(!ayaDarMashinBazAst && !ayaMashinRoshanAst){
                out.println("mashin dar hal harekat ast!");
            }else{
                out.println("mashin park ast!");
            }
        }
    }

}
