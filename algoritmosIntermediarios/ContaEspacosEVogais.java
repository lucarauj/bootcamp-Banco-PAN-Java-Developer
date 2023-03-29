package algoritmosIntermediarios;

import java.util.Scanner;

public class ContaEspacosEVogais {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		int espacos = 0;
		int vogais = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == ' ') {
				espacos++;
			}

			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				vogais++;
			}
		}

		System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais);

		sc.close();
	}
}
