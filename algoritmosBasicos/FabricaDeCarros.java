package algoritmosBasicos;

import java.util.Scanner;

/*
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
 * (aplicados ao custo de fábrica). 
 * O gerente de uma loja de carros gostaria de um programa para calcular o preço de um carro novo para os clientes. 
 * Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e 
 * deverá escrever programa para ler esses valores e imprimir o valor final do carro.
 */

public class FabricaDeCarros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double custoFabrica = scan.nextInt();
		double percentualDistribuidor = scan.nextInt();
		double percentualImpostos = scan.nextInt();

		double Distribuidor = custoFabrica * (percentualDistribuidor / 100);
		double Impostos = custoFabrica * (percentualImpostos / 100);
		double custoConsumidor = custoFabrica + Distribuidor + Impostos;

		System.out.printf("%.0f", custoConsumidor);
		
		scan.close();
	}
}
