package Ex2AgendaTelefonica;

public class Main {

	public static void main(String[] args) {
		Persoana p1 = new Persoana("Maria", 78570567);
		AgendaTelefonica agenda = new AgendaTelefonica();
		agenda.addPersoana(p1);
		int nrTel = agenda.findPersoana("Maria");
		System.out.println(nrTel);
	}

}
