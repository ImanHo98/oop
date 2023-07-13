//import Khodor.Mashin;

import Khodro.Khodro;
import Khodro.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghty_Dar_Baste_va_Roshan_Bashad() {

        Khodro benz = new Mashin("benz");
        Khodro volvo = new Mashin("Volvo");

        boolean ayaHarekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();

        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);

    }

}
