package donnees;

public class SelecteurArtiste implements Selecteur{
    private final String nomArtiste;

    public SelecteurArtiste(String s){
        nomArtiste = s;
    }
    @Override
    public boolean garderCd(CD cd) {
        return cd.getNomArtiste().equals(nomArtiste);
    }
}
