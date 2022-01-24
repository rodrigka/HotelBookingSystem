public class Reservation {

	//Attributs :
	private int numReserv;
	private String dateReserv;
	private String heureArrive;
	private int numPerso;
	
	//Getters et Setters :
	public String getDateReserv() {
		return dateReserv;
	}
	public void setDateReserv(String dateReserv) {
		this.dateReserv = dateReserv;
	}
	public String getHeureArrive() {
		return heureArrive;
	}
	public void setHeureArrive(String heure) {
		this.heureArrive = heure;
	}
	public int getNumPerso() {
		return numPerso;
	}
	public void setNumPerso(int numCouch) {
		this.numPerso = numCouch;
	}
	public int getNumReserv() {
		return numReserv;
	}
	public void setNumReserv(int numReserv) {
		this.numReserv = numReserv;
	}
	
	//Association monovaluée :
	public Client enrClient;
	public Client getEnrClient() {
		return enrClient;
	}
	public void setEnrClient(Client enrClient) {
		this.enrClient = enrClient;
			System.out.println("Le client : "+this.enrClient.getNom()+", vient de faire une reservation.");
	}
	
	//Constructeur :
	public Reservation (int n, int p, String d, String h) {
		this.setNumReserv(n);
		this.setNumPerso(p);
		this.setDateReserv(d);
		this.setHeureArrive(h);
	}
	
	//Methodes :
	public void afficher () {
		System.out.println(this.toString());
	}
	
	public void actChoisie() {
		if (this instanceof Activite ) {
			System.out.println("Activité choisie par le client "+this.enrClient.getNom()+" : "+ this.getClass());
		}
		else {
			System.out.println("Il ne s'agit pas d'une activité");
		}
	}
	
	public String toString() { 
		String chaine;
	if (getEnrClient() == null) {
			chaine ="";
		}
		else {
			chaine ="\n"+"Le client : "+this.enrClient.getNom()+"\n"
					+"N° de reservation : " + this.getNumReserv()+"\n"
					+"Type : "+ this.getClass()+"\n"
					+"Nombre de personnes : "+ this.getNumPerso()+"\n"
					+"Date et heure d'arrivée : "+this.getDateReserv()+" à "+this.getHeureArrive();
		}
		return chaine;
	}
}
