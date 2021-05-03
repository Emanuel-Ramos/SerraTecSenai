package exercicioImovel02;

public class Apto extends Imovel {
	private int andar;

	
	
	@Override
	public String toString() {
		return " Apto Andar " + andar + super.toString() ;
	}

	public Apto(String local, double valorImovel, int andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	
}
