package br.com.serratec.conta;

public class Conta {
	private String titular;
	private int numero;
	private double saldo;
	
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	public Conta() {
		
	}
	
	public Conta(String titular, int numero) {
		getTitular();
		getNumero();
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
