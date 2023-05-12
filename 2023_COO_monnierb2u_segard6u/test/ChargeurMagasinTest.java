import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

class ChargeurMagasinTest {

    @Test
    void chargerMagasin() {
        ChargeurMagasin m = new ChargeurMagasin("musicbrainzSimple/");
        Magasin ma;
        boolean b;
        try {
            b = true;
            ma = m.chargerMagasin();
            assertEquals(ma.getNombreCds(),12,"le nombre de CD doit être 12");
        } catch (FileNotFoundException e) {
            b = false;
        }
        assertTrue(b,"est true si le chemin existe");
    }
    }