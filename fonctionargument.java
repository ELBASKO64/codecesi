package  fr.elbasko.programme ;

public class Main {

	public  static  void  main(String [] arg ) {

	int note1 =  10 ;
	int note2 =  20 ;
	int note3 =  30 ;

	int calcul = (note1 + note2 + note3) /  3 ;

	System.out.println(calcul);



	String pseudo =  " elbasko " ;
	String [] names =  new  String [] { " Aritz " , " aritz " , " inaki " };
		System.out.println(names [ 1 ]);

	if (names [ 0 ] . equalsIgnoreCase (names [ 1 ])) {
		System.out.println( " le meme nom " );
	} else {
		System.out.println( " pas le meme nom " );
	
	}
	sendMessage("test"); //test
	sendMessage("football"); // football

	}
	
	private static void sendMessage(String message) {
		System.out.println("je s'appelle groot : " + message);
	}
}
	


		

	
		

	


