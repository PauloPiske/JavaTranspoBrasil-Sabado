package br.com.cusojava.aula002;

import java.util.Scanner;

public class RetanguloExDois {
	
	public static void main(String[] args) {
		
		System.out.println("C�uculo de um ret�ngulo, informe os dados abaixo");
		
		Scanner retangulo = new Scanner(System.in);
		System.out.println("informe a base do ret�ngulo");
		String base = retangulo.nextLine();
		
		double base2 = Double.parseDouble(base);
		
		
		System.out.println("Informe a altura do ret�ngulo");
		String altura = retangulo.nextLine();

		double altura2 = Double.parseDouble(altura);
		
		double area = base2 * altura2;
		double perimetro = (base2 * 2) + (altura2 * 2);
		
		System.out.printf("O valor da �rea � %.2f.\n" , area);
		System.out.printf("O valor do per�metro � %.2f.\n", perimetro);
		
		
	}

}
