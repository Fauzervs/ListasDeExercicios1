/*f) Faça um programa que calcule a área de um circulo.*/

import java.util.*;

public class Exercicio1f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio do circulo");
		double r = sc.nextDouble();
		double area = (r * r) * 3.14;

		System.out.println("A area do circulo é = " + area);
	}

}
