/*g) Sabe –se que:
1 Pé = 12 polegadas;
1 Jarda = 3 Pés;
1 Milha = 1.760 Jarda;
Faça um programa que recebe um número em Pés, faça as conversões a seguir e mostre os resultados.
-polegadas
-jardas
-milhas
*/

import java.util.*;

public class Exercicio1g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero em Pés");
		double pes = sc.nextDouble();
		System.out.println("Converta numero em plegada = " + pes * 12);
		System.out.println("Digite um numero em jardas = " + pes / 3);
		System.out.println("Digite um numero em milhas = " +pes/5280);
		
		
		
		

	}

}
