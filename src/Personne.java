
public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String telephone;
	
	public Personne(String nom, String prenom, Adresse adresse, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	
	public Personne(String unNom, String unPrenom) {
		nom = unNom;
		this.prenom = unPrenom;
		adresse = new Adresse();
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	public void affiche() {
		System.out.println(toString());
	}
	
	public String toString(){
		return nom+";"+prenom+";"+adresse+";"+telephone;
	}
}
