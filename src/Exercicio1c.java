/*c)	Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salario,
  sabendo-se que este sofreu um aumento de 25%. */

import java.util.*;

public class Exercicio1c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O Salário do funcionário é R$");
		double sal = sc.nextDouble();
		System.out.println("Digite o percentual do aumento");
		double perc = sc.nextDouble();
		double reajuste = sal * (perc / 100 + 1);
		System.out.println("-----O Salário com aumento de "+perc+"% é R$" + reajuste + "------");
	}

}
