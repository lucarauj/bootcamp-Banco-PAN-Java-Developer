package algoritmosIntermediarios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 * Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
 * Perimetro = XX.X
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
 * Area = XX.X
 * Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
 */

public class Triangulo {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		if((A+B) > C && (A+C) > B && (B+C) > A) {
			System.out.println("Perimetro = " + (A + B + C));
		} else {
			System.out.println("Area = "+ ((A + B) * C)/2);
		}
		
		leitor.close();
		
	}
	
}
