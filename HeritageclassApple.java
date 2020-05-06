package fr.elbasko.programme;

public class Apple extends Fruit {
	
	
	public Apple() {
		super(" pomme ");
	}

	@Override
	public void taste() {
		System.out.println(" la pomme a un gout sucr� ");
		super.miam();
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

}
