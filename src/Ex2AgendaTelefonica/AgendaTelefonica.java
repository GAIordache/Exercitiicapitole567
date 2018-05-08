package Ex2AgendaTelefonica;

import java.util.ArrayList;

public class AgendaTelefonica {
	private ArrayList<Persoana> listaPersoane = new ArrayList();
	
	
	
	//public AgendaTelefonica(ArrayList<Persoana> pListaPersoane) {
	//	super();
	//	listaPersoane = pListaPersoane;
	//}

	public boolean addPersoana(Persoana pPersoana) {
		
		listaPersoane.add(pPersoana);
		return true;
	}
	
	public int findPersoana(String pNume) {
		for(Persoana pPer : listaPersoane) {
			if(pPer.getNume()==pNume) {
				return pPer.getNrTelefon();
			}
		}
		return -1;
	}
	
}
