package Medico_paciente;

import java.util.Scanner;

import br.serratec.com.medico.Medico;

public class medico_paciente {
	public static void main(String[] args) {
		Medico medico01 = new Medico(12345, "Ana Maria", 0, 250);
		Medico medico02 = new Medico(456789, "Antonio", 0, 300);
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha a forma de pagamento");
		String formaPagamento = ler.next();
//		if (formaPagamento == "dinheiro") {
//			Medico.pagamentoDinheiro();
//		}else {
//			Medico.pagamentoPlano();
//		}
		
	}
}
