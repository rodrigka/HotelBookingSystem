import java.util.ArrayList;

public class Planning extends ArrayList<Reservation>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	//Associations monovalu�es:
	public Reservation enrReserv;
	public Reservation getEnrReserv() {
		return enrReserv;
	}
	public void setEnrReserv(Reservation enrReserv) {
			this.enrReserv = enrReserv;
			if (this.enrReserv.getEnrClient() != null) {
				this.add(enrReserv);
			}
	}
	
	//Methodes :
	public String toString() { 
		String chaine;
	if (this.size() == 0) {
			chaine = "\n"+"Il n'y a pas de reservations enregistr�es sur le planning";
		}
		else {
			chaine = "\n"+"Reservations de la journ�e : "+this.size();
		}
		return chaine;
	}
	
	public void afficherPlanning() {
		System.out.println(this.toString());
		for (Reservation arb1 : this) {
			arb1.afficher();
		}	
	}	
}
