package exercicios_maratona;

public class AtletaAmador extends Maratona {
	boolean atestado;

	
	
	@Override
	public String toString() {
		return super.toString() + "AtletaAmador [atestado=" + atestado + "]";
	}

	public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	public boolean isAtestado() {
		return atestado;
	}

	public void setAtestado(boolean atestado) {
		this.atestado = atestado;
	}
	
	
	@Override
	public String verificaSituacao(int idade, double altura) {		
		super.verificaSituacao(idade, altura);
		if (isAtestado() == true) {
			return 'Aprovado';
		}else {
			return 'Reprovado';
		}
	}
}
