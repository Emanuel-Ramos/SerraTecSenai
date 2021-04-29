package br.com.serratec.programa_conta;

import java.util.Scanner;

import br.com.serratec.conta.Conta;

public class programa_conta {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Cadastrar conta: Digite 1 ");
		System.out.println("Ver conta: Digite 2 ");
		String entrada = ler.next();
		if (entrada == "1") {
			Conta conta01 = new Conta();
			System.out.println("Digite o titular da conta");
            conta01.setTitular(ler.nextLine());
            System.out.println("Digite o numero da conta");
            conta01.setNumero(ler.nextInt());
            System.out.println("Digite o saldo inicial da conta");
            conta01.setSaldo(ler.nextDouble());
            System.out.println("\n Conta concluida com sucesso");
//		}else if (entrada == "2") {
//			System.out.println(conta01);
//		} else {
//			System.out.println("Digite um numero valido");
//		}
		
		ler.close();
	}

	}}
