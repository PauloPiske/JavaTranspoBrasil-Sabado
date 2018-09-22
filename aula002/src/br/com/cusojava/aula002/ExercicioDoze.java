package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioDoze {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da primeira nota.");
		double nota1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite o valor da segunda nota.");
		double nota2 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite o valor da terceira nota.");
		double nota3 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite o valor da quarta nota");
		double nota4 = Double.parseDouble(teclado.nextLine());
		
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if (media >= 9) {
			System.out.println("Conceito A.");
		} else if(media >= 8 ){
			System.out.println("Conceito B.");
		} else if(media >= 6) {
			System.out.println("Conceito C.");
		} else if(media >= 5) {
			System.out.println("Conceito D.");
		} else {
			System.out.println("Insuficiente");
		}
		teclado.close();
		}
}
