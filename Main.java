package fr.elbasko.programme;

public class Main {

	public static void main(String[] arg) {
		
	int money = 700;
	int pricephone = 800;
	boolean hasPhone = true;
	
	if(money >= pricephone && !hasPhone) {
		System.out.println("tu peux acheter le telephone");	
	} else {
		System.out.println("tu n'as pas assez d'argent pour acheter le telephone et tu as deja un telephone");
	}
		

	}
		
	

}
