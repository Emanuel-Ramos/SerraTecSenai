package Animais;

import java.time.LocalDate;

public class Tucano extends Ave {
	private double peso;

	
	@Override
	public String toString() {
		return "\nTucano/" + super.toString() + " peso= " + peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}
	
	@Override
	public String voar() {
		return super.voar();
	}
	
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Som de tucano";
	}

}
