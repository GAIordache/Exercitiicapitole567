package ClaseMostenire;

public class Caine extends Animal {

	public Caine(String pType,int pNrLegs, String pName) {
		super(pType,pNrLegs,pName);
	}
	
	@Override
	public void scoateSunet() {
		System.out.println("ham ham!");
	}
}
