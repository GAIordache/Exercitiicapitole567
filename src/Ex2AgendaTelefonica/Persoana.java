package Ex2AgendaTelefonica;

public class Persoana {
	private String mNume;
	private int mNrTelefon;
	
	public Persoana(String pNume,int pNrTelefon) {
		this.mNrTelefon = pNrTelefon;
		this.mNume = pNume;
	}
	
	public void setNume(String pNume) {
		this.mNume = pNume;
	}
	
	public String getNume() {
		return mNume;
	}
	
	public void setTelefon (int pNrTelefon) {
		this.mNrTelefon = pNrTelefon;
	}
	
	public int getNrTelefon () {
		return mNrTelefon;
	}
}
