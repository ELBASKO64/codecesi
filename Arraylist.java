package  fr.elbasko.programme ;

import java.util.ArrayList;

public class Main {

	public  static  void  main(String [] arg ) {
		
		ArrayList list = new ArrayList();
		list.add(25);
		list.add(" texte");
		list.add(new Object());
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
	}
}
	


		

	

	


