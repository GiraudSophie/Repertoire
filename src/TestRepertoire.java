
public class TestRepertoire {
	public static void main (String args[]) {
		Repertoire g1 = new Repertoire();
		new Fenetre(g1);

		Adresse adresse1 = new Adresse("rue des champs", "91150", "Etampes");
		Personne perso1 = new Personne("Durand", "Loic", adresse1, "0116191817");
		g1.ajoutePersonne(perso1);
		
		Personne perso2 = new Personne("DURAND", "Paul", new Adresse("10 rue du pont","91150","ETAMPES"), "0102030405");
		g1.ajoutePersonne(perso2);
		perso2 = new Personne("DUPONT", "Pierre", new Adresse("78 rue des fleurs","91150","ETAMPES"), "0102030405");
		g1.ajoutePersonne(perso2);
		g1.ajoutePersonne(new Personne("MARTIN", "Léa", new Adresse("8 av. 8 mai 45","91150","ETAMPES"), "0102030405"));
		g1.ajoutePersonne(new Personne("LEPONT", "Arthur", new Adresse("59 av. de Saclas","91150","ETAMPES"), "0102030405"));

	}
} 

