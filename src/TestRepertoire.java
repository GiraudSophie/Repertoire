public class TestRepertoire {

	public static void main(String[] args) {
		Personne toto = new Personne("Dupond","toto");
		//toto.affiche();
		//String coordonnees = toto.toString();
		//System.out.println(coordonnees);
		
		Adresse adresse1 = new Adresse("rue des champs", "91150", "Etampes");
		Personne personne1 = new Personne("Durand", "Loic", adresse1, "0116191817");
		//System.out.println(personne1);
		//personne1.affiche();
		
		Repertoire perso = new Repertoire();
		perso.ajoutePersonne(toto);
		perso.ajoutePersonne(personne1);
		System.out.println(perso);
		
		Personne personne2 = new Personne("Giraud", "Pierre");
		perso.ajoutePersonne(personne2);
		Personne personne3 = new Personne("Giraud", "Hector");
		perso.ajoutePersonne(personne3);
		System.out.println(perso);
		
		toto.setTelephone("01002030405");
		System.out.println(perso);
		
		System.out.println(perso.rechercheNom("Giraud"));
		
		Personne persoRecherchee = perso.rechercheNom("Durand");
		persoRecherchee.affiche();
		
	}

}
