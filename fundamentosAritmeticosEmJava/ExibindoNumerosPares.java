package fundamentosAritmeticosEmJava;

import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero e mostre os n�meros pares at� esse n�mero, inclusive ele mesmo.
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
