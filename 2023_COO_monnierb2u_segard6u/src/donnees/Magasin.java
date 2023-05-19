package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * <p>
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    public ArrayList<CD> getListeCds() {
        return listeCds;
    }

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }



	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}


    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder � un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i) {
        CD res = null;
        if ((i >= 0) && (i < this.listeCds.size()))
            res = this.listeCds.get(i);
        return (res);
    }

    // TODO  ajouter une methode de tri
    public void trierAlbum() {
        for (int i = 0; i < listeCds.size() - 1; i++) {
            String s = listeCds.get(i).getNomCD();
            int a = i+1;
            int min = listeCds.get(a).getNomCD().compareTo(s);
            for (int x = i + 2; x < listeCds.size(); x++) {
                if (listeCds.get(x).getNomCD().compareTo(s) < min) {
                    min = listeCds.get(x).getNomCD().compareTo(s);
					a = x;
                }
            }
			if(min<0){
				CD c = listeCds.get(a);
				listeCds.set(a,listeCds.get(i));
				listeCds.set(i,c);
			}
        }
    }

    public void trierArtiste() {
		for (int i = 0; i < listeCds.size() - 1; i++) {
			String s = listeCds.get(i).getNomArtiste();
			int a = i+1;
            int min = listeCds.get(a).getNomArtiste().compareTo(s);
			for (int x = i + 2; x < listeCds.size(); x++) {
				if (listeCds.get(x).getNomArtiste().compareTo(s) < min) {
					min = listeCds.get(x).getNomArtiste().compareTo(s);
					a = x;
				}
			}
			if(min<0){
				CD c = listeCds.get(a);
				listeCds.set(a,listeCds.get(i));
				listeCds.set(i,c);
			}
		}
    }
}
