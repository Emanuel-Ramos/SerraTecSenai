package exercicioImovel02;

public class Casa extends Imovel {
	private boolean garagem = false;
	
	
	@Override
	public String toString() {
		return garagem ?  " Casa " + "Com garagem " + super.toString() :  " Casa " + "Sem Garagem " + super.toString();
	}

	public Casa(String local, double valorImovel, boolean garagem) {
		super(local, valorImovel);
		this.garagem = garagem;
	}

	public boolean isGaragem() {
		return garagem;
	}

	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}
	
	
}
