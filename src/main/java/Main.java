import khodro.jadid.Mashin;

import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args){

        String mark = args[0];
        int gonjayesh = parseInt(args[1]);
        String noeDanse = args[2];

        Mashin mashin = new Mashin(mark, gonjayesh, noeDanse);
        if (mashin.ayaDarHalHarekatAst()){
            out.println("Mashin dar hal harkat ast.");
        }else{
            out.println("Mashin istade ast.");
        }

        out.println(mashin.getMark());

        out.println("Payane Ejra!");
    }

}
