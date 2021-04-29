package exercicioImovel;

public class Imovel {
	private int codImovel;
	private String bairro;
	private String tipo;
	private double valor;
	private static int totalImoveis;
	
	

	public Imovel() {
		
	}

	public Imovel(int codImovel, String bairro, String tipo, double valor) {
		super();
		this.codImovel = codImovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
		Imovel.totalImoveis += 1;
	}
	
	public static int getTotalImoveis() {
		return totalImoveis;
	}

	public static void setTotalImoveis(int totalImoveis) {
		Imovel.totalImoveis = totalImoveis;
	}

	public int getCodImovel() {
		return codImovel;
	}
	public void setCodImovel(int codImovel) {
		this.codImovel = codImovel;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void reajuste(double valor, String tipo) {
		if (tipo == "casa") {
			this.setValor(valor * 0.05 + valor);
			System.out.printf("Reajuste %.2f", valor);
		}else{
			this.setValor(valor * 0.08 + valor);
			System.out.printf("Reajuste %.2f \n", valor);
		}
	}
	public void categoria(double valor) {
		 if(valor > 50000) {

	            System.out.printf("Categoria A\n");

	        }else if(valor <= 50000 && valor > 10000) {

	            System.out.printf("Categoria B\n");

	        }else {

	            System.out.printf("Categoria C\n");
	        }
	}	
}
