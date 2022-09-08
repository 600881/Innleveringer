package no.hvl.dat100;

import java.util.Scanner;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class oppgave2obli1 {

	
public static void main (String[] args) {
	
	
	for (int i = 1; i <= 10; i = i + 1) {
		boolean gyldig = false;
		while (!gyldig) {
			gyldig = true;
			String poengsum = showInputDialog("Skriv inn poengsum sudent" + i + ": ");
			
			int input = parseInt(poengsum); 
			
			if (input <= 100 && input >= 90) {
				showMessageDialog(null, "Karakter A");
				
			
			} else if (input <= 89 && input >= 80) {
				showMessageDialog(null, "Karakter B");
				
			} else if (input <= 79 && input >= 60) {
				showMessageDialog(null, "Karakter C");
				
			} else if (input <= 59 && input >= 50) {
				showMessageDialog(null, "Karakter D");
				
			}else if (input <= 49 && input >= 40) {
				showMessageDialog(null, "Karakter E");
				
			}else if (input <= 39 && input >= 0) {
				showMessageDialog(null, "Karakter F");
			
			}else {
				showMessageDialog(null, "Feilmelding");
				gyldig = false;
			}	
		}
		
	}
	
	
}
}
