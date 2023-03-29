package algoritmosIntermediarios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * H� um pa�s denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, 
 * pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, 
 * sem qualquer desvio. A moeda deste pa�s � o Loli, cujo s�mbolo � o R$.
 * Voc� ter� o desafio de ler um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Loli. 
 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 * Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, 
 * pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. 
 * No exemplo fornecido a seguir, a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
 * O valor deve ser impresso com duas casas decimais.
 */

public class TaxaDeImpostoDeRenda {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		double renda = leitor.nextDouble();
		double base1 = 0;
		double base2 = 0;
		double base3 = 0;
		double imposto = 0;
		
		if(renda > 4500.00) {
			base1 = renda - 4500.00;
			imposto = base1 * 0.28;
		}
		
		if(renda > 3000.00) {
			base2 = renda - base1 - 3000.00;
			imposto = imposto + base2 * 0.18;
		}
		
		if(renda > 2000.00) {
			base3 = renda - base1 - base2 - 2000.00;
			imposto = imposto + base3 * 0.08;
		}		
		
		if(renda > 2000.00) {
			System.out.printf("R$ %.2f", imposto);
		} else {
			System.out.println("Isento");
		}		
		
		leitor.close();

	}

}