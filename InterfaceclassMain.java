package  fr.elbasko.programme ;

public class Main {

	public  static  void  main(String [] arg ) {
		
		Apple a = new Apple();
		a.taste();
		a.miam();

		
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
	
		
		if(! (a instanceof PeelFruit)) {
			System.out.println(" le fruit n'implemente pas avec l'interface PeelFruit ");
		
		
		}
		
		
		
		
		
		


		
	}
}
	


		

	
		

	


