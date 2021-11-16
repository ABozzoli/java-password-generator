package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {

		// settaggio variabili
		String firstName;
		String lastName;
		String favColour;
		
		int birthDay;
		int birthMonth;
		int birthYear;
		
		int birthTotal;
		String generatedPass;
		
		// inizializzazione variabili
		firstName = "Alessandro";
		lastName = "Bozzoli";
		favColour = "blu";
		
		birthDay = 10;
		birthMonth = 1;
		birthYear = 1992;
		
		birthTotal = birthDay + birthMonth + birthYear;
		generatedPass = firstName + "-" + lastName + "-" + favColour + "-" + birthTotal;
		
		// print
		System.out.println("The generated password is: " + generatedPass);

	}

}
