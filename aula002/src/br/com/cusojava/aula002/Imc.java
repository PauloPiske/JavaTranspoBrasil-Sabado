package br.com.cusojava.aula002;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		
		System.out.println("Calcule o �ndice de massa corporal.");
		
		Scanner imc = new Scanner(System.in);
		
		System.out.println("Informe sua altura:");
		String altura = imc.nextLine();
		
		double altura1 = Double.parseDouble(altura);
		
		System.out.println("Informe seu peso:");
		String peso = imc.nextLine();
		
		double peso1 = Double.parseDouble(peso);
		
		double calculoImc = peso1/(altura1 * altura1);
		
		System.out.printf("O c�lculo do IMC � %.2f", calculoImc);
		
		
	}
	
	
}
