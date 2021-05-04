package Animais;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {
	protected String raca;


	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}	
	
	@Override
	public String toString() {
		return "Mamifero Raca= " + raca + "," + super.toString() ;
	}

	public String amamentar() {
		return "O animal esta sendo amamentado";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
