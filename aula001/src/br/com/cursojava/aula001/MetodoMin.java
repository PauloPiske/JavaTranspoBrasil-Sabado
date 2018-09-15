package br.com.cursojava.aula001;

public class MetodoMin {
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 7;
		int num3 = 20;
		int num4 = 30;
		
		int menor = Math.min(num1, num2);
		menor = Math.min(menor, num3);
		menor = Math.min(menor, num4);
				
		System.out.printf("O menor número da listagem é %d.", menor);
	}
}
