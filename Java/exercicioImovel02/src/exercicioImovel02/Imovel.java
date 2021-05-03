package exercicioImovel02;

public class Imovel {
	protected String local;
	private double valorImovel;	
	
	@Override
	public String toString() {
		return " Local=" + local + ", Valor do Imovel= " + valorImovel;
	}

	public Imovel(String local, double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
	
	
}	
