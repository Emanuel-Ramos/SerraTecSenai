package exercicioCarro;

public class Carro extends Veiculo implements Step {
	private int qtd_lugares;

	
	
	@Override
	public String toString() {
		return super.toString() + " qtd_lugares = " + qtd_lugares;
	}

	public Carro(String marca, String modelo, int ano, int qtd_lugares) {
		super(marca, modelo, ano);
		this.qtd_lugares = qtd_lugares;
	}

	public int getQtd_lugares() {
		return qtd_lugares;
	}

	public void setQtd_lugares(int qtd_lugares) {
		this.qtd_lugares = qtd_lugares;
	}

	@Override
	public double calcularIPVA(int ano) {
		return ano * 0.10;
	}

	@Override
	public void calibrado(boolean ok) {
		System.out.println(ok ? "Calibrado" : "Nao calibrado");
		
	}
	
}
