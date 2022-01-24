//Mettre en forme la date
public class Chambre extends Reservation {

	//Attributs : 
	private int numCham;
	private String nomCham = "Classique";
	
	//Getters et setters :
	public int getNumCham() {
		return numCham;
	}
	public void setNumCham(int numCham) {
		this.numCham = numCham;
	}
	public String getNomCham() {
		return nomCham;
	}
	public void setNomCham(String nomCham) {
		this.nomCham = nomCham;
	}
	
	//Constructeur :
	public Chambre(int numReserv, int numPerso, String date, String heure, String n, int c) {
		super(numReserv, numPerso, date, heure);
		this.setNomCham(n);
		this.setNumCham(c);
	}
}
