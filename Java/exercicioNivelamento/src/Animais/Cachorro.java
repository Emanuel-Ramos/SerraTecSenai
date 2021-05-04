package Animais;

import java.time.LocalDate;

import Interfaces.AnimalDomestico;

public class Cachorro extends Mamifero implements AnimalDomestico{
	private boolean castrado;
	

	
	@Override
	public String toString() {
		return "\nCachorro/" + super.toString() +  "castrado= " + castrado;
	}

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
		if (this.castrado == true) {
			return;
		}else {
			levarVeterinario();
		}
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("\nO cachorro foi ao veterinario para castracao");
		this.castrado = true;
	}

	@Override
	public boolean alimentar() {
		return true;
	}
	
	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return super.amamentar();
	}
	
	public String emitirSom() {
		return "Som do cachorro";
	}
		
	
}
