package  fr.elbasko.programme ;

import java.util.ArrayList;

public class Main {

	public  static  void  main(String [] arg ) {
		
		ArrayList list = new ArrayList();
		list.add(25);
		list.add(" texte");
		list.add(new Object());
		
		System.out.println(list);
		
		if(list.size() != 1) {
			System.out.println(" le tableau n'est pas egale à 1 ");
			
		}
		if(list.contains(25)) {
			System.out.println(" l'element existe bien ");
		}
		
		System.out.println(list);
	}
}
	


		

	

	


