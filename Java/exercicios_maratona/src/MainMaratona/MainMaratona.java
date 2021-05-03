package MainMaratona;

import exercicios_maratona.AtletaAmador;
import exercicios_maratona.AtletaProfissional;

public class MainMaratona {

	public static void main(String[] args) {
		AtletaAmador atleta01 = new AtletaAmador("Jao", "M", 15, 1.90,  true);
		AtletaAmador atleta02 = new AtletaAmador("Maria", "F", 19, 1.90,  true);
		AtletaAmador atleta03 = new AtletaAmador("Arthur", "M", 29, 1.90,  false);
		AtletaProfissional atleta04 = new AtletaProfissional("Manel", "M", 20, 1.90,  75);
		AtletaProfissional atleta05 = new AtletaProfissional("Gui", "M", 19, 1.90,  80);
		
		System.out.println(atleta01);
		atleta01.verificaSituacao(atleta01.getIdade(), atleta01.getAltura());
		System.out.println(atleta02);
		
		System.out.println(atleta03);
		
		System.out.println(atleta04);
		
		System.out.println(atleta05);
	}
}
