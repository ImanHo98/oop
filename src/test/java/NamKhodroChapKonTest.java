import Khodro.Khodro;
import Khodro.Mashin;
import Khodro.Motor;
import Khodro.Kashti;
import Khodro.NamKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKonTest {

    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        // Given
        Khodro benz = new Mashin("Benz",120,"Automatic");
        Khodro volvo = new Mashin("volvo",80,"Dasti");
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();

        Khodro[] khodroha = {benz, volvo, motor, kashti};
        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);

        // When

        String listNameKhodroha = namKhodroChapKon.execute();

        Assertions.assertEquals("Benz-volvo-Motor-kashti",listNameKhodroha);

    }

}
