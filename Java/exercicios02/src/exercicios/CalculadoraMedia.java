package exercicios;

import java.util.Scanner;

public class CalculadoraMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		double nota1 = ler.nextDouble();
		System.out.println("Segunda nota: ");
		double nota2 = ler.nextDouble();
		System.out.println("Terceira nota: ");
		double nota3 = ler.nextDouble();
		System.out.println((nota1 + nota2 + nota3)/3);
		if ((nota1 + nota2 + nota3)/3 < 60) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
	}
}
