package Pets;

import java.time.LocalDate;

public class Pet {
	private String nome;
	private String raca;
	private LocalDate data_vacinacao;
	private double valor_vacinas;
	private boolean vacinado;
	private TipoPet tipoPet;
	
		
	
	public Pet(String nome, String raca, TipoPet tipoPet) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.tipoPet = tipoPet;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public LocalDate getData_vacinacao() {
		return data_vacinacao;
	}
	public void setData_vacinacao(LocalDate data_vacinacao) {
		this.data_vacinacao = data_vacinacao;
	}
	public double getValor_vacinas() {
		return valor_vacinas;
	}
	public void setValor_vacinas(double valor_vacinas) {
		this.valor_vacinas = valor_vacinas;
	}
	public boolean isVacinado() {
		return vacinado;
	}
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	
	public void vacinar(LocalDate data, double valor) {
		this.data_vacinacao = data;
		this.valor_vacinas = valor;
		this.vacinado = true;
	}
	
	
}
