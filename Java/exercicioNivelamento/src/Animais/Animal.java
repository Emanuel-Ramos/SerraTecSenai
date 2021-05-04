package Animais;

import java.time.LocalDate;

public abstract class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;	
		
	public Animal(String nome, LocalDate dataVacinacao) {
		super();
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
		if(this.dataVacinacao == null) {
			this.levarVeterinario();
		}else {
			this.dataVacinacao = dataVacinacao;
		}
	}
	
	@Override
	public String toString() {
		return " Nome = " + nome + "," + " Data Vacinacao = " + dataVacinacao + ",";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataVacinacao() {
		return dataVacinacao;
	}
	public void setDataVacinacao(LocalDate dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}
	
	public void levarVeterinario() {
		System.out.println("\nO animal foi ao veterinario para vacinacao");
		this.dataVacinacao = LocalDate.parse("2021-12-01");
	}
	
}
