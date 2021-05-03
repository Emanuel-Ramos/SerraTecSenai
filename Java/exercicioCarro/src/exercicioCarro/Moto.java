package exercicioCarro;

public class Moto extends Veiculo {
	private int cilindradas;

	

	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return " Moto cilindradas = " + cilindradas  + super.toString();
	}

	@Override
	public double calcularIPVA(int ano) {
		return ano * 0.05;
	}
	
	
}
