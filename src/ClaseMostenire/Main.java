package ClaseMostenire;

public class Main {

	public static void main(String[] args) {
		Pisica p1 = new Pisica("pisica", 4, "Gigi");
		p1.scoateSunet();
		System.out.println(p1.getName() + " " + p1.getNrLegs() + " " + p1.getType());
	}

}
