package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioTreze {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro para saber se é Par ou Impar.");
		int numeroInformado = Integer.parseInt(teclado.nextLine());
		
	if(numeroInformado % 2 == 0) {
		System.out.printf("Número %d é par.", numeroInformado);
	} else {
		System.out.printf("Número %d é impar.", numeroInformado);
	}

	teclado.close();
	}
	
}

