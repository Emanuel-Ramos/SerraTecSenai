package MainPlano;

import OO.PagamentoPlano;
import OO.RepasseAnestesista;
import OO.RepasseClinica;
import OO.RepasseMedico;

public class TestePlano {
	public static void main(String[] args) {
		RepasseClinica clinica01 = new RepasseClinica("Unimed", "Nova Friburgo", "random cgc");
		RepasseMedico medico01 = new RepasseMedico("Unimed", "Gustavo", 1000);
		RepasseAnestesista anestesista01 = new RepasseAnestesista("Unimed", "Guilherme", 10000, "Local");
		
		
		System.out.println(clinica01);
		System.out.println(medico01);
		System.out.println(medico01.calcularPagamento());
		System.out.println(anestesista01);
		System.out.println(anestesista01.calcularPagamento());
	}
	
}
