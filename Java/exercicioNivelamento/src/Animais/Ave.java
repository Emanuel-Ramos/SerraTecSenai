package Animais;

import java.time.LocalDate;

public abstract class Ave extends Animal{
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Ave cor= " + cor + super.toString() ;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String voar() {
		return "A ave esta voando";
	}
}
