package br.serratec.com.medico;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double valor_consulta;
	
	public void pagamentoPlano(){
			
		}
	
	
	public Medico() {
		super();
	}
	
	public Medico(int crm, String nome, double salario, double valor_consulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valor_consulta = valor_consulta;
	}
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getValor_consulta() {
		return valor_consulta;
	}
	public void setValor_consulta(double valor_consulta) {
		this.valor_consulta = valor_consulta;
	}
	
	
	
}
