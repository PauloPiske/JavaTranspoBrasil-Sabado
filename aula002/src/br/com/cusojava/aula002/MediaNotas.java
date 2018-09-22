package br.com.cusojava.aula002;

import java.util.Scanner;

public class MediaNotas {
	
		public static void main(String[] args) {
			Scanner nota = new Scanner(System.in);
			
			System.out.println("Informe valor da sua nota:");
			String nota1 = nota.nextLine();
			
			System.out.println("Informe valor da sua nota:");
			String nota2 = nota.nextLine();
			
			System.out.println("Informe valor da sua nota:");
			String nota3 = nota.nextLine();
			
			double nota4 = Double.parseDouble(nota1);
			double nota5 = Double.parseDouble(nota2);
			double nota6 = Double.parseDouble(nota3);
			
			double media = (nota4 + nota5 + nota6)/3;
			System.out.printf("Sua média é: %.2f", media);
			
		
			
			
		}
		
}
