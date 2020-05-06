package fr.elbasko.programme;

public abstract class Fruit {
	
	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void miam () {
		System.out.println(" miam manger 5 fruits par jour / Nom du fruit : " + getName());
	}
	
	public String getName() {
		return name;
		
	}

}
