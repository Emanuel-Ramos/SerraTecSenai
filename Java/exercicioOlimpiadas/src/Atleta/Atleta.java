package Atleta;

import Olimpiadas.Olimpiadas;

public class Atleta extends Pais implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	static int TOTAL_PARTICIPANTES[] ;
	
	public Atleta(String nome, String nome2, double peso) {
		super(nome);
		nome = nome2;
		this.peso = peso;
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getModalidade() {
		return modalidade;
	}



	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}



	public static int[] getTOTAL_PARTICIPANTES() {
		return TOTAL_PARTICIPANTES;
	}



	public static void setTOTAL_PARTICIPANTES(int[] tOTAL_PARTICIPANTES) {
		TOTAL_PARTICIPANTES = tOTAL_PARTICIPANTES;
	}

	

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", pes o=" + peso + ", modalidade =" + modalidade	+ super.toString() + "]";
	}


	@Override
	public String verificaSituacao() {
		if (this.peso >= 90) {
			this.setModalidade("Peso pesado");
		 	return "Participara";
		} else if (this.peso >= 60){
			this.setModalidade("Peso medio");
			return  "Participara";
		} else {
			return "Nao Participara";
		}
	}
}