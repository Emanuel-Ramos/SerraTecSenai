package OO;

public class PagamentoPlano {
	private String empresa;
	static double valorPago = 80;
	static double valoriss = 0.05;
	
	public double calcularPagamento() {
		return valorPago - valorPago * 0.05 ;
	}
	
	
	public PagamentoPlano(String empresa) {
		super();
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "PagamentoPlano [empresa=" + empresa + "]";
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
