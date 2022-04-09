import khodro.jadid.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {

    @Test
    void mashin_bayad_harekat_kinad_vaqti_dar_baste_ast_va_roshan_ast() {

        //Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarkatMikonad = volvo.ayaDarHalHarekatAst();


        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarkatMikonad);
    }

}
