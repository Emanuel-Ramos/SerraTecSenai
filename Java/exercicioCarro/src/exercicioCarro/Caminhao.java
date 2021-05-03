package exercicioCarro;

public class Caminhao extends Veiculo implements Step{
	private int capacidadeCarga;

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
		super(marca, modelo, ano);
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		return " Caminhao " + capacidadeCarga + super.toString() ;
	}
	

	@Override
	public double calcularIPVA(int ano) {
		// TODO Auto-generated method stub
		return ano * 0.15;
	}

	@Override
	public void calibrado(boolean ok) {
		System.out.println(ok ? "Calibrado" : "Nao calibrado");
		
	}
}
