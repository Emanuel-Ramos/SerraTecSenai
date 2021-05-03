package exercicioAtleta;

public class Time {
	private String nome;
	private String tecnico;
	private Atletas atleta;
	
	
	
	@Override
	public String toString() {
		return "Time [nome=" + nome + ", tecnico=" + tecnico + ", atleta=" + atleta + "]";
	}

	public Time(String nome, String tecnico, Atletas atleta) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.atleta = atleta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public Atletas getAtleta() {
		return atleta;
	}
	public void setAtleta(Atletas atleta) {
		this.atleta = atleta;
	}
	
	
}
