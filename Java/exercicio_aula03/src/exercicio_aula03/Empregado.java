package exercicio_aula03;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;
	private double salario_desconto;
	
	public Empregado() {
		
	}
	

	
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public void calcularImposto(double salario) {
		
		if (salario >= 4664.68 ) {
			setSalario_desconto(salario - salario * 0.275);
		}	else if (salario >= 3751.06 || salario <= 4664.67) {
			setSalario_desconto( salario - salario * 0.225);
		}	else if (salario >= 2826.66 || salario <= 3751.05) {
			setSalario_desconto(salario - salario * 0.15);
		}	else {
			setSalario_desconto(salario);
		}
	}



	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", salario=" + salario + ", salario_desconto="
				+ salario_desconto + "]";
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public void setSalario_desconto(double salario_desconto) {
		this.salario_desconto = salario_desconto;
	}

	public double getSalario_desconto() {
		return salario_desconto;
	}


	
}
