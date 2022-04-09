import khodro.Khodro;
import khodro.jadid.Mashin;
import khodro.Motor;
import khodro.NameKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKonTest {

    @Test
    void Bayad_Nam_Khodro_Chap_Konad(){
        // Given
        Khodro Benz = new Mashin("Benz", 120, "Automatic");
        Khodro Volvo = new Mashin("Volvo", 80, "Manual");
        Khodro Motor = new Motor();

        Khodro[] khodroha = {Benz, Volvo, Motor};
        NameKhodroChapKon nameKhodroChapKon = new NameKhodroChapKon(khodroha);

        // When
        String listeNameKhodroha = nameKhodroChapKon.execute();

        // Then
        Assertions.assertEquals("Benz-Volvo-Motor", listeNameKhodroha);
    }
}
