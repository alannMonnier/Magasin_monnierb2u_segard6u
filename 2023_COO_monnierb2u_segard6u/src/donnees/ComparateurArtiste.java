package donnees;
import java.util.ArrayList;

public class ComparateurArtiste implements ComparateurCD {
    @Override
    public void trier(ArrayList<CD> CDs) {
        for (int i = 0; i < CDs.size() - 1; i++) {
            String s = CDs.get(i).getNomArtiste();
            int a = i+1;
            int min = CDs.get(a).getNomArtiste().compareTo(s);
            for (int x = i + 2; x < CDs.size(); x++) {
                if (CDs.get(x).getNomArtiste().compareTo(s) < min) {
                    min = CDs.get(x).getNomArtiste().compareTo(s);
                    a = x;
                }
            }
            if(min<0){
                CD c = CDs.get(a);
                CDs.set(a,CDs.get(i));
                CDs.set(i,c);
            }
        }
    }
}
