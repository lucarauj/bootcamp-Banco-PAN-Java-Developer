package algoritmosBasicos;

import java.util.Scanner;

/*
 * Daenerys � a khaleesi dos Dothraki. Juntamente com Drogon, eles v�o atr�s do Tyrion, para tentar dominar Westeros. 
 * Ela possui, al�m do seu drag�ozinho, um rastreador que mede o n�vel de energia de qualquer ser vivo. 
 * Todos os seres com o n�vel menor ou igual a 8000, ela considera como se fosse um inseto. 
 * Quando passa deste valor, que foi o caso do Drogon, ela se espanta e grita �Mais de 8000�. 
 * Baseado nisso, utilize a mesma tecnologia e analise o n�vel de energia dos seres vivos.
 */

public class Dragao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int casos = ler.nextInt();

		int poderDeLuta;

		for (int i = 0; i < casos; i++) {

			poderDeLuta = ler.nextInt();

			if (poderDeLuta > 8000) {
				System.out.println("Mais de 8000!");
			} else {
				System.out.println("Inseto!");
			}
		}

		ler.close();
	}
}