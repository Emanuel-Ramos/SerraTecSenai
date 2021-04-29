package br.com.serratec.classes;


public class Pessoas {
	private String nome;
	private String CPF;
	private String Data_nascimento;
	private String cargo;
	private int salario;
	
	
	
	public Pessoas(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", CPF=" + CPF + ", Data_nascimento=" + Data_nascimento + ", cargo=" + cargo
				+ ", salario=" + salario + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getData_nascimento() {
		return Data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		Data_nascimento = data_nascimento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
		
	
	
}
