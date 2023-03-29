package fundamentosAritmeticosEmJava;

import java.util.Scanner;

/*
 * Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
 */

public class ExibindoNumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
