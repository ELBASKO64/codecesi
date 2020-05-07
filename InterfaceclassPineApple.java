package fr.elbasko.programme;

public class PineApple extends Fruit implements PeelFruit  {

	
	private boolean peeled = false;
	
	
	
	public PineApple() {
		super(" ananas ");
	}

	@Override
	public void taste() {
		System.out.println(" l'annas a un gout un peu acide ");
		
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean IsPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return " piquante ";
	}

}
