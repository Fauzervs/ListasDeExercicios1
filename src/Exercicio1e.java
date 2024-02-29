/*e) Faça um programa que calcule a área de um triangulo.*/

import java.util.*;
public class Exercicio1e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite a base do Triangulo");
	int base = sc.nextInt();
	
	System.out.println("Digite a altura do Triangulo");
	int altura = sc.nextInt();
	
	double area = (base*altura)/2;
	
	System.out.println("A área do triagulo é ="+area);
	
	}

}
