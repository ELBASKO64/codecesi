package  fr.elbasko.programme ;

public class Main {

	public  static  void  main(String [] arg ) {
		
		Day moment = Day.MATIN;
		System.out.println(moment.name());
		
		moment = Day.SOIR;
		System.out.println("Nous sommes actuellement le " + moment.name().toLowerCase() + " il est actuellement " + moment.getHour() + " h , " + moment.getMessage());
		
		Apple a = new Apple();
		a.taste();
		a.miam();

		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
	
		
		if(a instanceof PeelFruit) {
			PeelFruit fruit = pen;
		
		
		}

		
	}
}
	


		

	

	


