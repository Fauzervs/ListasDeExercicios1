//a)Faça um programa que receba 3 notas, calcule a média aritmética destas notas e apresente o resultado.

import java.util.*;

public class Exercicio1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota 1");
		int nota1 = sc.nextInt();

		System.out.println("Digite a nota 2");
		int nota2 = sc.nextInt();

		System.out.println("Digite a nota 3");
		int nota3 = sc.nextInt();

		System.out.println("Nota1="+ nota1 +" Nota2=" +nota2 +" Nota3 =" +nota3);
		System.out.println("---A média das notas é ="+ (nota1 +nota2 +nota3)/3+"----");
	}

}
