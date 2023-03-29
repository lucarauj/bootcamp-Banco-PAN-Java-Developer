package fundamentosAritmeticosEmJava;

import java.io.IOException;
import java.util.Locale;

/*
 * Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e 
 * o total de combustível consumido (em litros).
 */

import java.util.Scanner;

public class ConsumoMedioDoAutomovel {
	
	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaTotal = sc.nextInt();
        double combustivelConsumido  = sc.nextDouble();

        double media = distanciaTotal/combustivelConsumido;
        
        System.out.println(String.format("%.3f km/l", media));   
        
        sc.close();

	}
}
