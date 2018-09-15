package br.com.cursojava.aula001;

public class Diametro {
	public static void main(String[] args){
		int diametro = 20;
		int raio = (diametro / 2);
		double pi = 3.1416f;
		
		System.out.printf("a = %f *(%d * %d) a área de um circulo com diametro igual a 20 é %f", pi, raio, raio, pi * raio * raio);
		
	}
}
