package br.com.cusojava.aula002;

import java.util.Scanner;

public class RetanguloExDois {
	
	public static void main(String[] args) {
		
		System.out.println("Cáuculo de um retângulo, informe os dados abaixo");
		
		Scanner retangulo = new Scanner(System.in);
		System.out.println("informe a base do retângulo");
		String base = retangulo.nextLine();
		
		double base2 = Double.parseDouble(base);
		
		
		System.out.println("Informe a altura do retângulo");
		String altura = retangulo.nextLine();

		double altura2 = Double.parseDouble(altura);
		
		double area = base2 * altura2;
		double perimetro = (base2 * 2) + (altura2 * 2);
		
		System.out.printf("O valor da área é %.2f.\n" , area);
		System.out.printf("O valor do perímetro é %.2f.\n", perimetro);
		
		
	}

}
