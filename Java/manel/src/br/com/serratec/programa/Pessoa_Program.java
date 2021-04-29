package br.com.serratec.programa;

import br.com.serratec.classes.Pessoas;

import java.util.Scanner;

public class Pessoa_Program {
	public static void main(String[] args) {
		System.out.println("Hello world!!");
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seus dados: Nome/CPF/Nascimento/Cargo/Salario");
		Pessoas pessoa01 = new Pessoas(ler.next(), ler.next());
		System.out.println(pessoa01);
	}
}


