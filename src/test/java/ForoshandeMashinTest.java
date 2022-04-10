import foroshande.Foroshande;
import khodro.jadid.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {

    @Test
    void Bayad_Tedade_Kole_Mashin_Haye_Forokhte_Shode_Ra_Be_Dast_Avarim(){

        Foroshande ali = new Foroshande();
        Foroshande naser = new Foroshande();

        ali.forosheMashin();
        ali.forosheMashin();
        ali.forosheMashin();
        ali.forosheMashin();
        naser.forosheMashin();

        Assertions.assertEquals(5, Mashin.tedadeForosh );

    }
}
