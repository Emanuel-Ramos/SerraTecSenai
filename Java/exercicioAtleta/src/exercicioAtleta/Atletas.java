package exercicioAtleta;

public class Atletas {
	private String nome;
	private int idade;
	private String esportePraticado;
	
	
	@Override
	public String toString() {
		return "Atletas [nome=" + nome + ", idade=" + idade + ", esportePraticado=" + esportePraticado + "]";
	}

	public Atletas(String nome, int idade, String esportePraticado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.esportePraticado = esportePraticado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEsportePraticado() {
		return esportePraticado;
	}
	public void setEsportePraticado(String esportePraticado) {
		this.esportePraticado = esportePraticado;
	}
	
	
}
