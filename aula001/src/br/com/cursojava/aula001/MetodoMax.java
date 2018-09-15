package br.com.cursojava.aula001;

public class MetodoMax {
	public static void main(String[] args){
		int num1 = 3;
		int num2 = 7;
		int num3 = 25;
		int num4 = 10;
		int menor1 = Math.max(num1, num2);
		int menor2 = Math.max(num3, num4);
		int menorDeTodos = Math.max(menor1, menor2);
		
		System.out.printf("O menor número da listagem é %d.", menorDeTodos);
	}
}
