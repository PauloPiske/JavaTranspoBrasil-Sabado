package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioDez {
	
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite o valor da primeira nota.");
			double nota1 = Double.parseDouble(teclado.nextLine());
			
			System.out.println("Digite o valor da segunda nota.");
			double nota2 = Double.parseDouble(teclado.nextLine());
			
			System.out.println("Digite o valor da terceira nota.");
			double nota3 = Double.parseDouble(teclado.nextLine());
			
			double media = (nota1 + nota2 + nota3) /3;
			
		if (media >=7) {
			System.out.println("'Aprovado'");
		}else {
			System.out.println("'Reprovado'");
		}
		
			
		}
}
