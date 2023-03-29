package fundamentosAritmeticosEmJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. 
 * Em seguida, apresente a quantidade de valores positivos digitados.
 */

public class QuantidadeDeNumerosPositivos {

	public static void main(String[] args) throws IOException {
		
        String linha;
        Double n;
        int positivo, i;
  
        positivo = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (i = 0; i < 6; i ++) {
            linha = br.readLine();
            n = Double.parseDouble(linha);
            if(n >= 0)positivo++;
        }
  
        System.out.println("" + positivo + " valores positivos");
     }
}
