package algoritmosBasicos;

import java.util.Scanner;

/*
 * Neste desafio, faça um programa que calcule o valor de H com N termos. 
 * Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
 */

public class SomaDeHComNTermos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double h = 0;

		for(double i = 1; i <= n; i++) {
			
			h = h + (1/i);			
		}
		
		System.out.printf("%.0f", h);
		
		sc.close();
	}
}