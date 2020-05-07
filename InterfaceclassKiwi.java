package fr.elbasko.programme;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi(String name) {
		super(" kiwi fruit ");
	}

	@Override
	public void taste() {
		System.out.println(" le gout est plutot sucré ");
		
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean IsPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return " doux ";
	}

}
