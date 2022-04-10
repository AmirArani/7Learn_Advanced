import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void Bayad_Amaliat_Riazi_Anjam_Dahad(){
        double moteqayer = -1.5;
        int variable = 0;

        double meqdareMotlaq = Math.abs(moteqayer);

        Assertions.assertEquals(1.5, meqdareMotlaq);
        Assertions.assertEquals(1, Math.cos(variable));
    }
}
