package algoritmosIntermediarios;

import java.util.Scanner;

/*
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
 * receberá ainda um desconto de 10% sobre este total. 
 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e 
 * escreva o valor a ser pago pelo cliente.
 */

public class QuitandaDoSeuZe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int kgMorangos = input.nextInt();
		int kgMacas = input.nextInt();
		double valorMorango = 0;
		double valorMacas = 0;
		double valorTotalCompra;
		
		if(kgMorangos <= 5 && kgMorangos >= 0) {
			valorMorango = kgMorangos*2.5;
		} else if(kgMorangos > 5 && kgMorangos >= 0) {
			valorMorango = kgMorangos*2.2;
		}		
		
		if(kgMacas <= 5 && kgMacas >= 0) {
			valorMacas = kgMacas*1.8;
		} else if(kgMacas > 5 && kgMacas >= 0) {
			valorMacas = kgMacas*1.5;
		}
		
		valorTotalCompra = valorMorango + valorMacas;
		
		if(valorTotalCompra > 25.00 || (kgMorangos + kgMacas) > 8) {
			valorTotalCompra = valorTotalCompra * 0.9;
		}
		
		System.out.println(valorTotalCompra);
		
		
		input.close();

	}
}