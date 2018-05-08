package ClaseMostenire;

public class Animal {
	private String mType;
	private int mNrLegs;
	private String mName;
	
	

	public Animal() {
		
	}
	
	public Animal(String pType,int pNrLegs, String pName) {
		this.mNrLegs=pNrLegs;
		this.mType=pType;
		this.mName=pName;
	}
	
	public void setType(String pType) {
		this.mType=pType;
	}
	public String getType() {
		return mType;
	}

	public int getNrLegs() {
		return mNrLegs;
	}

	public void setNrLegs(int pNrLegs) {
		mNrLegs = pNrLegs;
	}
	
	public String getName() {
		return mName;
	}

	public void setName(String pName) {
		mName = pName;
	}
	
	public void scoateSunet() {
		System.out.println("NU stiu sunetul unui animal generic!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + mNrLegs;
		result = prime * result + ((mType == null) ? 0 : mType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mNrLegs != other.mNrLegs)
			return false;
		if (mType == null) {
			if (other.mType != null)
				return false;
		} else if (!mType.equals(other.mType))
			return false;
		return true;
	}
	
	
	
	
}
