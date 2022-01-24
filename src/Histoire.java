// Fait par Katerine Rodriguez L3-SNGI

//Methode main :
public class Histoire {

	public static void main(String[] args) {
		Planning p = new Planning();
		
		Client a = new Client ("Celine Dion","0625645389");
		Reservation r = new Chambre (123, 2, "13/05/2021", "13:30","Classique",201);
		r.setEnrClient(a);
		p.setEnrReserv(r);
		
		Client b = new Client ("Eliot Dupont","0625649487");
		Reservation r1 = new Restaurant (456, 1, "13/05/2021", "20:00");
		r1.setEnrClient(b);
		p.setEnrReserv(r1);
		
		Client c = new Client ("Pascal Blanc","0695349123");
		Reservation r2 = new Spa (789, 3, "13/05/2021", "16:30","17:30");
		r2.setEnrClient(c);
		p.setEnrReserv(r2);
		
		a.afficher();
		r2.actChoisie();
		r.afficher();
		p.afficherPlanning();
	}
}