package  fr.elbasko.programme ;

public class Main {

	public  static  void  main(String [] arg ) {
		
		Player player1 = new Player("elbasko" , 26.0 , 600.0);
		System.out.println("name : " + player1.getName());
		System.out.println("vie : " + player1.getHealth());
	
		
		
		
		
		Player player2 = new Player("groot" , 40.0 , 300.0);
		player2.setName("thor");
		player2.damage(player1.getAttack());
		System.out.println("name : " + player2.getName());
		
		
		
	
		
		
		
		
		


		
	}
}
	


		

	
		

	


