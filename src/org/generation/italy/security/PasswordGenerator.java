package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {

		// settaggio variabili
		String firstName;
		String lastName;
		String prefColour;
		
		int birthDay;
		int birthMonth;
		int birthYear;
		
		// inizializzazione variabili
		firstName = "Alessandro";
		lastName = "Bozzoli";
		prefColour = "blu";
		
		birthDay = 10;
		birthMonth = 1;
		birthYear = 1992;
		
		// programma
		int birthTotal = birthDay + birthMonth + birthYear;
		
		System.out.println(firstName + "-" + lastName + "-" + prefColour + "-" + birthTotal);

	}

}
