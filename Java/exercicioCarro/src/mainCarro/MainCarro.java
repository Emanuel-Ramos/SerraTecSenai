package mainCarro;

import exercicioCarro.Caminhao;
import exercicioCarro.Carro;
import exercicioCarro.Moto;
import exercicioCarro.Step;
import exercicioCarro.Veiculo;

public class MainCarro {

	public static void main(String[] args) {
		Veiculo veiculo01 = new Carro("FORD", "ka", 2006, 4);
		Veiculo veiculo02 = new Moto("Yamaha", "XJ", 2020, 100);
		Veiculo veiculo03 = new Caminhao("Volvo", "brabo", 2021, 5000);
		
		System.out.println(veiculo01);
		System.out.println(veiculo01.calcularIPVA(veiculo01.getAno()));
		System.out.println(veiculo02);
		System.out.println(veiculo02.calcularIPVA(veiculo02.getAno()));
		System.out.println(veiculo03);
		System.out.println(veiculo03.calcularIPVA(veiculo03.getAno()));
		
		veiculo01.calibrado(true);
	}

}
