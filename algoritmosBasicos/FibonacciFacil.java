package algoritmosBasicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. 
 * Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. 
 * Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
 */

public class FibonacciFacil {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();

		int primeiro = 0;
		int segundo = 1;
		int terceiro = 0;

		List<Integer> lista = new ArrayList<Integer>();

		if (N > 0) {
			lista.add(primeiro);
		}

		if (N > 1) {
			lista.add(segundo);
		}

		if (N > 0 && N < 46) {

			for (int i = 2; i < N; i++) {

				terceiro = primeiro + segundo;
				primeiro = segundo;
				segundo = terceiro;
				lista.add(terceiro);
			}

			for (int j = 0; j < lista.size(); j++) {

				if (j == (lista.size() - 1)) {
					System.out.print(lista.get(j));
				} else {
					System.out.print(lista.get(j) + " ");
				}
			}

		}

		leitor.close();
	}
}