package exercicios_maratona;

public class Maratona {
	String nome;
	String sexo;
	int idade;
	double altura;

	
	
	public Maratona(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Maratona [nome=" + nome + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean verificaSituacao(int idade, double altura) {
		if (idade <= 18) {
			return false;
		}else {
			if (altura <= 1.79) {
				return false;
			}else {
				
			} return true;
		}
	}
	
}
