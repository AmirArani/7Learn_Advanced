import khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotorTest {

    @Test
    void motor_bayad_harekat_kinad_vaqti_roshan_ast() {
        // Given
        Motor motor = new Motor();

        // When
        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHalHarekatAst();

        // Then
        assertTrue(ayaHarekatMikonad);
    }
}
