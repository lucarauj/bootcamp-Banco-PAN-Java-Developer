package fundamentosAritmeticosEmJava;

import java.util.Scanner;

/*
 * Você deve fazer a leitura de 5 valores inteiros. 
 * Em seguida mostre quantos valores informados são pares, 
 * quantos valores informados são ímpares, 
 * quantos valores informados são positivos e 
 * quantos valores informados são negativos. 
 * Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.
 */

public class AnaliseDeNumeros {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int n = 0;        
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
        	
        	n = sc.nextInt();
        	  	
        	if(n % 2 == 0) {
        		par++;
        	} else {
        		impar++;
        	}
        	
        	if(n > 0) {
        		positivo++;
        	} else if (n < 0) {
        		negativo++;
        	}
        	
        }
        
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
        
        sc.close();
        
    }	
}
		
		

	
