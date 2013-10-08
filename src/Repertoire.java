import java.util.ArrayList;


public class Repertoire {
private ArrayList<Personne> liste;
	
	public Repertoire() {
		liste = new ArrayList<Personne>();
	}
	
	public void ajoutePersonne(Personne un) {
		liste.add(un);
	}
	
	public String toString() {
		String res = "";
		for(Personne p : liste) {
			res = res + p + "\n";
		}
		return res;
	}
	
	public Personne rechercheNom(String nom) {
		Personne res = null;
		for(Personne p : liste) {
			if( p.getNom().equalsIgnoreCase(nom) ) {
				res = p;
			}
		}
		return res;
	}

	public Personne recherchePersonne(int i) {
		return(liste.get(i));
	}

	public int taille() {
		return liste.size();
	}
}
