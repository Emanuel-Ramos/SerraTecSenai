package OO;

public class RepasseAnestesista extends RepasseMedico {
	private String tipoAnestesia;

	
	@Override
	public double calcularPagamento() {
		return super.calcularPagamento() + 1000;
	}
	
	public RepasseAnestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return "RepasseAnestesista [tipoAnestesia=" + tipoAnestesia + ", toString()=" + super.toString() + "]";
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	
}
