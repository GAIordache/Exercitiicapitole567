package ClaseMostenire;

public class Pisica extends Animal {
	
	public Pisica(String pType,int pNrLegs, String pName) {
		super(pType,pNrLegs,pName);
	}
	
	@Override
	public void scoateSunet() {
		System.out.println("miau!");
	}
	

}
