package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioQuatorze {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Para saber a sua categoria informe sua idade.");
		int idade = Integer.parseInt(teclado.nextLine());
		
		if(idade >= 18) {
			System.out.println("Pertence a Categoria Adulta.");
		} else if(idade >= 14) {
			System.out.println("Pertence a Categoria Junvenil.");
		} else if(idade >= 12) {
			System.out.println("Pertence a Categoria Infanto Juvenil");
		} else if(idade >= 9) {
			System.out.println("Pertence a Categoria Infantil");
		} else {
			System.out.println("Pertence a Categoria Mirim");
		}
		
	teclado.close();
	}
}
