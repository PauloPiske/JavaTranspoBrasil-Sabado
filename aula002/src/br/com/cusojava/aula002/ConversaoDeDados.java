package br.com.cusojava.aula002;

import java.util.Scanner;

public class ConversaoDeDados {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe sua Idade");
		String textoIdade = teclado.nextLine();
		
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.println("Sua idade daqui 20 anos será...");
		System.out.println(idade + 20);
		
	}

}
