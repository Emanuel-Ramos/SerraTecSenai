package MainImovel;

import java.util.Scanner;

import exercicioImovel.Imovel;

public class ProgramImovel {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Imovel imovel = new Imovel();

		int opcao = 0;
		do {

	            System.out.println("1- Cadastrar Imovel");
	            System.out.println("2- Exibir os dados da conta");
	            System.out.println("3- Sair");
	            opcao = ler.nextInt();
	            ler.nextLine();

	            switch(opcao) {
	            case 1:
	                imovel.setCodImovel(Imovel.getTotalImoveis());
	                System.out.println("Digite o nnome do bairro");
	                imovel.setBairro(ler.next());
	                System.out.println("Digite o tipo do imovel");
	                imovel.setTipo(ler.next());
	                System.out.println("Digite o valor do imovel");
	                imovel.setValor(ler.nextDouble());
	                System.out.println("\n Imovel cadastrado com sucesso");

	                break;

	            case 2:
	                System.out.printf("Imovel: %d, Bairro %s, Tipo %s, Valor: %.2f", imovel.getCodImovel(), imovel.getBairro(), imovel.getTipo(), imovel.getValor());

	                break;
	            case 3:
	    			System.out.println("Encerrando a aplicação.");
	    		default:
	    		  System.out.println(" ");
	    		}
	    		
	    		
	    	} while (opcao  != 3);
	    		
	    ler.close();

	    imovel.reajuste(imovel.getValor(), imovel.getTipo());
	    
	    imovel.categoria(imovel.getValor());

}
	      
}

