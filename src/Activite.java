//Mettre en forme la date
public class Activite extends Reservation {

	//Attributs :
	private String hrSortie;
	public String getHrSortie() {
		return hrSortie;
	}
	public void setHrSortie(String hrSortie) {
		this.hrSortie = hrSortie;
	}
	
	//Constructeur :
	public Activite(int r, int n, String d, String h, String s) {
		super(r, n, d, h);
		this.setHrSortie(s);
	}
}
