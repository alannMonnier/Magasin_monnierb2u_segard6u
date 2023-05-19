package donnees;

public class ComparateurNbPiste implements ComparateurCD{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.nbPistes()< cd2.nbPistes();
    }
}
