package foroshande;

import khodro.jadid.Mashin;

public class Foroshande {

    public static  String[] nameForoshandegan = new String[10];

    //static block
    static {
        nameForoshandegan[0] = "ali";
        nameForoshandegan[1] = "ahmad";
    }

    public void forosheMashin() {

        Mashin.tedadeForosh++;
    }
}
