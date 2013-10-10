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
		/*int i;
		for(i=0;i<liste.size();i++) {
			res = res + liste.get(i).toString() + "\n";
		}*/
		
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
}
