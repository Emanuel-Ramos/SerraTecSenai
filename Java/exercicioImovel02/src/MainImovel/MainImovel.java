package MainImovel;

import exercicioImovel02.Apto;
import exercicioImovel02.Casa;

public class MainImovel {
	public static void main(String[] args) {
		Apto apto01 = new Apto("Centro", 100000, 5);
		Casa casa01 = new Casa("Olaria", 150000, false);
		
		System.out.println(casa01);
		System.out.println(apto01);
	}
}
