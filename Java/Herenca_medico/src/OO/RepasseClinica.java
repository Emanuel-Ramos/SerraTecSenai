package OO;

public class RepasseClinica extends PagamentoPlano {
	private String nome;
	private String cgc;
	
		
	public RepasseClinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + "nome=" + nome + ", cgc=" + cgc + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	
	
}
