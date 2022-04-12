import khodro.jadid.Mashin;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(in);
        out.println("Esme shoma chist?");
        String nam = scanner.nextLine();
        out.println("Sen khod ra vared konid");
        String sen = scanner.nextLine();
        out.println("dar che shahri zendegei mikonid?");
        String shahr = scanner.nextLine();
        out.println("Man " + nam + " hastam, "+sen+" sale az "+shahr);

        out.println("Payane Ejra!");
    }

}
