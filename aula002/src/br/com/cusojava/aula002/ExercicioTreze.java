package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioTreze {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro para saber se � Par ou Impar.");
		int numeroInformado = Integer.parseInt(teclado.nextLine());
		
	if(numeroInformado % 2 == 0) {
		System.out.printf("N�mero %d � par.", numeroInformado);
	} else {
		System.out.printf("N�mero %d � impar.", numeroInformado);
	}

	teclado.close();
	}
	
}

