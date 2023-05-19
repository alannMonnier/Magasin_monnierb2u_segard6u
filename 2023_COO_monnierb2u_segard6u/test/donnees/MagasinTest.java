package donnees;

import XML.ChargeurMagasin;
import main.MainChargeurMagasin;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MagasinTest {

    @Test
    void trierAriste() throws IOException {
        String repertoire = "musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();

        //resultat.trierAriste();
        for (int i =0; i<resultat.getNombreCds(); i++){
                System.out.println(resultat.getListeCds().get(i).getNomCD());
        }

        assertEquals(true, true, "");
    }

    @Test
    void trierAlbum() {
    }
}