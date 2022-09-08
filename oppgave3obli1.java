package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class oppgave3obli1 {

	public static void main(String[] args) {
		
		String input = showInputDialog("fakultet: ");
		
		int fakultet = parseInt(input); 
		
		int sum = 1;
		
		if (fakultet > 0) {
			
			for(int i = 1; i <= fakultet; i++) {
				
				sum = sum * i;
				
			}
		}
		
		showMessageDialog(null, sum);
		
	}

}
