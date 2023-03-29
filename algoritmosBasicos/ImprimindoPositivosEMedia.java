package algoritmosBasicos;

import java.util.Locale;
import java.util.Scanner;

/*
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 * Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 */

public class ImprimindoPositivosEMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
	    int cont = 0;
	    double media = 0;
	    double x;
	    double y = 0;
	    
	    for(int i = 0; i < 6; i++) {
	    	
	    	x = leitor.nextDouble();
	    	
	    	if(x >= 0) {
	    		cont++;
	    		y+= x;
	    	}
	    }

		media = y/cont;
	
		System.out.println(cont + " valores positivos");
		System.out.println(String.format("%.1f", media));
		
		leitor.close();
		
	}

}