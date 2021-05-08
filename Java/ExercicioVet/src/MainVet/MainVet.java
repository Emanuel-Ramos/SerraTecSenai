package MainVet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dono.Dono;
import Pets.Pet;
import Pets.TipoPet;



public class MainVet {

	public static void main(String[] args) {
		List<Dono> donos = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		int opcaoDono = 0;
		boolean foi = false;
		
		
		
		do {
			System.out.println("1 - Dono");
		    System.out.println("2 - Exibir todos os donos e pets");
		    System.out.println("3 - Exibir pets nao vacinados");
		    System.out.println("4 - Sair");
		    try {
		        opcao = ler.nextInt();
		    } catch (Exception e) {
		        System.out.println("Encerrando, pois não digitou valor inteiro");
		    }
		
		    switch(opcao) {
		    case 1:
		    	do {
		 		    ler.nextLine();
			    	System.out.println("1 - Cadastrar Dono");
				    System.out.println("2 - Adicionar Pet");
				    System.out.println("3 - Vacinar Pet");
				    System.out.println("4 - Voltar");
				    opcaoDono = ler.nextInt();
			    	switch (opcaoDono) {
						case 1: {
							System.out.println("Digite o seu Nome");
							String nomeDono = ler.next();
							System.out.println("Digite o CPF");
							String cpfDono = ler.next();
							Dono dono = new Dono(nomeDono, cpfDono);
							if (donos.contains(dono)) {
								System.out.println("Já existe.");
							} else {
									donos.add(dono);
								}
							}
							break;
						case 2: {							
							System.out.println("Digite o nome do pet");
							String nomePet = ler.next();
							System.out.println("Digite a raca do pet");
							String racaPet = ler.next();
							System.out.println("Digite o tipo do pet 1- cachorro  / 2 - gato /  3 - coelho / 4 - jabuti");
							int tipoPet = ler.nextInt();
							while (tipoPet < 0 || tipoPet > 5) {
								System.out.println("Digite o tipo do pet 1- cachorro  / 2 - gato /  3 - coelho / 4 - jabuti");
								tipoPet = ler.nextInt();
							}
							switch (tipoPet) {
							case 1: {
								Pet novoPet = new Pet(nomePet, racaPet, TipoPet.CACHORRO);
								System.out.println("Digite o nome do dono");
								String nomeDono = ler.next();
								donos.forEach((d) -> adicionaPet(d, nomeDono, novoPet));
								break;
							}
							case 2: {
								Pet novoPet = new Pet(nomePet, racaPet, TipoPet.GATO);
								System.out.println("Digite o nome do dono");
								String nomeDono = ler.next();
								donos.forEach((d) -> adicionaPet(d, nomeDono, novoPet));
								break;
							}
							case 3:{
								Pet novoPet = new Pet(nomePet, racaPet, TipoPet.COELHO);
								System.out.println("Digite o nome do dono");
								String nomeDono = ler.next();
								donos.forEach((d) -> adicionaPet(d, nomeDono, novoPet));
								break;
							}
							case 4: {
								Pet novoPet = new Pet(nomePet, racaPet, TipoPet.JABUTI);
								System.out.println("Digite o nome do dono");
								String nomeDono = ler.next();
								donos.forEach((d) -> adicionaPet(d, nomeDono, novoPet));
								break;
							}
							default:
								throw new IllegalArgumentException("Unexpected value: " + tipoPet);
							}
							break;
						}
						case 3:
							break;
						default: 
							System.out.println(" ");
						}
			    	}while (opcaoDono != 4);
			    	
			    case 2:
			    	System.out.println();
			    	break;
			    
			    case 3:
			    	
			    	break;
			    	
			    default:
			    	System.out.println("Algo deu errado");
			    }
			    
			    	
			 
			    }while (opcao != 4);
		    
		
		ler.close();
	}

	public static void adicionaPet(Dono d, String nomeDono, Pet novoPet) {
		String nome = d.getNome();
		if (nome == nomeDono) {
				d.setPet(novoPet);
			}
	}
}
