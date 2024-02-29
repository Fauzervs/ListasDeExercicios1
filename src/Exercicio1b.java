/*b)Faça um programa que receba 3 notas e seus respectivos pesos, calcule a média ponderada destas notas
  e apresente o resultado. */

import java.util.*;

public class Exercicio1b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Nota1");
		int nota1 = sc.nextInt();
		System.out.println("Digite a Nota2");
		int nota2 = sc.nextInt();
		System.out.println("Digite a Nota3");
		int nota3 = sc.nextInt();
		int p1 = nota1 * 1;
		int p2 = nota2 * 2;
		int p3 = nota3 * 3;
		
		System.out.println("As notas com os respectivos pesos são ="+p1 + "-"+p2 + "-"+p3);
		System.out.println("----A média ponderada é="+(p1+p2+p3)/3+"---------");

	}

}
