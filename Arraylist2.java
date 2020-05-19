package  fr.elbasko.programme ;

import java.util.ArrayList;

public class Main {

	public  static  void  main(String [] arg ) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add(" texte ");
		list.add(" elbasko ");
		list.add(" je s'appelle groot");
		
		System.out.println(list);
		

		if(list.contains(25)) {
			System.out.println(" l'element existe bien ");
		}
		
		System.out.println(list);
	}
}
	


		

	

	


