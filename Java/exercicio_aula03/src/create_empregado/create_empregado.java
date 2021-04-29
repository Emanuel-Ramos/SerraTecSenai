package create_empregado;

import exercicio_aula03.Empregado;

public class create_empregado {
	public static void main(String[] args) {
		Empregado empregado01 = new Empregado("Manel", "Ramos", 5000);
		Empregado empregado02 = new Empregado("Ramon", "Ribeiro", 20000);
		empregado01.calcularImposto(empregado01.getSalario());
		empregado02.calcularImposto(empregado02.getSalario());
		System.out.println(empregado01);
		System.out.println(empregado02);
	}
}
