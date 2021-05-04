package Animais;

import java.time.LocalDate;

import Interfaces.AnimalDomestico;

public class Cavalo extends Mamifero implements AnimalDomestico {
	private String marcaFerradura;

	public String getMarcaFerradura() {
		return marcaFerradura;
	}

	public void setMarcaFerradura(String marcaFerradura) {
		this.marcaFerradura = marcaFerradura;
	}

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public String toString() {
		return "\nCavalo/" + super.toString() + " Marca Ferradura= " + marcaFerradura;
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return super.amamentar();
	}
	
	public String emitirSom() {
		return "Som do cavalo";
	}
}
