package no.hvl.dat100;

import java.util.Scanner;

public class oppgave1obli {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inntekt: ");
		double inntekt = Double.parseDouble(input.nextLine());
		double resterende = inntekt;
		
		double sats = 0;
		
		while (resterende > 0) {
			if (resterende >= 934051) {
				resterende -= 934051;
				sats += resterende * ((14.45) / 100);
				
			} else if (resterende >= 580651) {
				resterende  -= 580651;
				sats += resterende * ((11.52) / 100);
				
			} else if (resterende >= 230951) {
				resterende -= 230951;
				sats += resterende * ((2.41) / 100);
				
			} else if (resterende >= 164101) { 
				resterende -= 164101;
				sats += resterende * ((0.93) / 100);
				
			} else {
				resterende -= resterende;
			}
		}
		System.out.println("Brutto lønn: " + (inntekt - sats));	
		System.out.println("Skatt: " + sats);
		input.close();
	}
}
	
	
	