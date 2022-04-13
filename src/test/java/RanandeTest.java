import khodro.Ranande;
import org.junit.jupiter.api.Test;

public class RanandeTest {
    @Test
    void Bayad_NoeGovahiname_Va_Nam_Ra_Chap_Konad(){
        Ranande ranande = new Ranande();
        Ranande.Gavahiname gavahiname = new Ranande.Gavahiname();
        gavahiname.print();
    }

    @Test
    void Bayad_Nam_Ra_Chap_Konad(){
        Ranande.StaticGavahiname staticGavahiname = new Ranande.StaticGavahiname();
        staticGavahiname.print();
    }
}
