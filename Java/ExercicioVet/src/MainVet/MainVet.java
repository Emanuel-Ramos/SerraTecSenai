package MainVet;

import java.time.LocalDate;
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
							int tipoPet = 0;
							do {
								System.out.println("Digite o tipo do pet 1- cachorro  / 2 - coelho");
								tipoPet = ler.nextInt();
								TipoPet tipo = (tipoPet == 1) ? TipoPet.CACHORRO : TipoPet.COELHO;
								Pet novoPet = new Pet(nomePet, racaPet, tipo);
								System.out.println("Novo Pet cadastrado com sucesso, agora digite o Nome do dono");
								String novoDono = ler.next();
																
								adicionaPet(donos, novoDono, novoPet);
								
							}while (tipoPet != 1 && tipoPet != 2);
							
							
							break;
						}
						case 3:
							System.out.println("Digite o nome do Pet: ");
							String donoPet = ler.nextLine();
							ler.nextLine();
							System.out.println("Digite o valor da vacina: ");
							double valorVacina = ler.nextDouble();
							ler.nextLine();
							System.out.println("Digite a data da vacina: ");
							String dataVacinacao = ler.nextLine();
							LocalDate dataCadastro;
							dataCadastro = LocalDate.parse(dataVacinacao);
							
							vacinaPet(donos, donoPet, valorVacina, dataCadastro);
							break;
						default: 
							System.out.println(" ");
						}
			    	}while (opcaoDono != 4);
			    	
			    case 2:
			    	for (Dono dono : donos) {
						System.out.println(dono);
					}
			    	break;
			    
			    case 3:
			    	for (Dono d : donos) {
						if (d != null) {
							if(d.getPet().isVacinado() == false)
							System.out.println(d);
							}
			    	}
			    	break;
			    
			    case 4:
			    	System.out.println("Encerrando aplicacao");
			    	break;
			    default:
			    	System.out.println("Algo deu errado");
			    }
			    
			    	
			 
			    }while (opcao != 4);
		    
		
		ler.close();
	}

	private static void vacinaPet(List<Dono> donos, String nome, double valor, LocalDate data) {
		for (Dono dono : donos) {

            if (dono.getNome().equalsIgnoreCase(nome)) {
            	 dono.getPet().vacinar(data, valor);
            	 return;
            }
		}		
	}

	public static void adicionaPet(List<Dono> donos, String nomeDono, Pet novoPet) {
		for (Dono dono : donos) {

            if (dono.getNome().equalsIgnoreCase(nomeDono)) {
            	 dono.petDono(novoPet);
            	 System.out.println("Dono atribuido com sucesso");
            	 return;
            }
		}
	}
}
