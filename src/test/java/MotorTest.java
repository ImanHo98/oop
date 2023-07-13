import Khodro.Khodro;
import Khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {

    @Test
    void motor_Bayad_Harekat_Konad_Vaghty_Roshan_Ast() {
        Khodro motor = new Motor();

        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();

        assertTrue(ayaHarekatMikonad);



    }
}
