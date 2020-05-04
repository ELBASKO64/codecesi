package  fr.elbasko.programme ;

public class Main {

	public  static  void  main(String [] arg ) {

	int money = 880;
	int pricephone = 400;
	boolean hasphone = false;
	
	
	sendMessage(" la difference est de : " + totalcalcul(money, pricephone, hasphone), 26); //test

	}
	
	private static void sendMessage(String message, int number) {
		System.out.println(" ceci " + number + " je s'appelle groot : " + message);
	}
	
	private static int totalcalcul(int money, int pricephone, boolean hasphone) {
		
		if (money >= pricephone && !hasphone) {
		System.out.println( " tu peut acheter ce telephone " );
	} else {
		System.out.println( " tu n'a pas asssez d'argent pour acheter ce telephone et en plus tu as deja un telephone " );
	
	}
		return money - pricephone;
		
		
	}
}
	


		

	
		

	


