/*d)	Utilizando o exercícios anterior, inclua a condição de apresentar também o valor do aumento recebido.*/

import java.util.*;
public class Exercicio1d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O Salário do funcionário é R$");
		double sal = sc.nextDouble();
		System.out.println("Digite o percentual do aumento");
		double perc = sc.nextDouble();
		double reajuste = sal * (perc / 100 + 1);
		System.out.println("-----O Salário com aumento de "+perc+"% é R$" + reajuste + "------");
		System.out.println("------O aumento no salário foi de R$"+(reajuste - sal)+"--------");

	}

}
