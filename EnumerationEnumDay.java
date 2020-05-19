package fr.elbasko.programme;

public enum Day {
	
	MATIN(8 , " Il est l'heure de se reveiller "),
	MIDI(12, " A table "), 
	APRESMIDI(15, " Bon match "), 
	SOIR(20, " Bon PUBG "), 
	NUIT(1, " Bonne nuit ");
	

	private int hour;
	private String messsage;
	
	Day(int hour, String message){
		this.hour = hour;
		this.messsage = message;
	}
	
	public String getMessage() {
		return messsage;
		
	}
	
	public int getHour() {
		return hour;
	}
}
