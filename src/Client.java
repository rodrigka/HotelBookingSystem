public class Client {

	//Attributs :
	private String nom;
	private String numTel;
	
	//Getters/setters :
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	//Constructeur :
	public Client (String n, String g) {
		this.setNom(n);
		this.setNumTel(g);
	}

	//Methodes:
	public void afficher () {
		System.out.println("\n"+"Client : "+this.getNom()+"\n"+
							"Numéro de telephone : "+this.getNumTel()+"\n");
	}
}
