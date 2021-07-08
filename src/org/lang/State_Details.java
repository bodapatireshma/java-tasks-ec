package org.lang;

public class State_Details extends Language_Info{

	public void southIndia() {
		System.out.println("South");
	}public void northIndia() {
		System.out.println("North");
		
	}public static void main(String[] args) {
		State_Details sd = new State_Details();
		sd.tamilLanguage();
		sd.englishLanguage();
		sd.hindiLanguage();
		sd.southIndia();
		sd.northIndia();
	}
}
