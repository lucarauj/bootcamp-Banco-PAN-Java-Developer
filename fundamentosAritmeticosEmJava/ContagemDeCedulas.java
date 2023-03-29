package fundamentosAritmeticosEmJava;

/*
 * Faça a leitura de um valor inteiro. 
 * Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. 
 * As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. 
 * Na sequência mostre o valor lido e a relação de notas necessárias.
 */

import java.util.Scanner;

public class ContagemDeCedulas {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;
        
        int notasInseridas = sc.nextInt();
        int atual = notasInseridas;
        
        if(atual >= 100) {
        	notas100 = atual / 100;
        }
        
        atual -= notas100 * 100;
        
        if(atual >= 50) {
        	notas50 = atual / 50;
        }
        
        atual -= notas50 * 50; 
        
        if(atual >= 20) {
        	notas20 = atual / 20;
        }
        
        atual -= notas20 * 20;
        
        if(atual >= 10) {
        	notas10 = atual / 10;
        }
        
        atual -= notas10 * 10;
        
        if(atual >= 5) {
        	notas5 = atual / 5;
        }
        
        atual -= notas5 * 5;
        
        if(atual >= 2) {
        	notas2 = atual / 2;
        }
        
        atual -= notas2 * 2;
        
        if(atual >= 1) {
        	notas1 = atual / 1;
        }
        
        atual -= notas1 * 1;
       
        
        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
        
        sc.close();
    }

}