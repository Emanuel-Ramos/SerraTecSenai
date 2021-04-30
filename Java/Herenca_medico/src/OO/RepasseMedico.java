package OO;

public class RepasseMedico extends PagamentoPlano {
	private String nome;
	private int crm;
	
	
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", crm=" + crm + ", Empresa=" + getEmpresa() + "]";
	}

	@Override
	public double calcularPagamento() {
		return super.calcularPagamento() + super.calcularPagamento() * 0.10;
	}
	
	public RepasseMedico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
}
