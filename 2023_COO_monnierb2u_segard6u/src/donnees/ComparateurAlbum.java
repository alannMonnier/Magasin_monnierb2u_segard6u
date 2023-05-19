package donnees;
import java.util.ArrayList;

public class ComparateurAlbum implements ComparateurCD {
    @Override
    public void trier(ArrayList<CD> CDs) {
        for (int i = 0; i < CDs.size() - 1; i++) {
            String s = CDs.get(i).getNomCD();
            int a = i+1;
            int min = CDs.get(a).getNomCD().compareTo(s);
            for (int x = i + 2; x < CDs.size(); x++) {
                if (CDs.get(x).getNomCD().compareTo(s) < min) {
                    min = CDs.get(x).getNomCD().compareTo(s);
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
