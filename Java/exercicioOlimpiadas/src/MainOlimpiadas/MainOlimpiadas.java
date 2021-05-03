package MainOlimpiadas;

import Atleta.Atleta;

public class MainOlimpiadas {

	public static void main(String[] args) {
		Atleta atleta01 = new Atleta("Inglaterra", "Marcos", 80);
		
		System.out.println(atleta01.verificaSituacao());
		System.out.println(atleta01);
		
	}

}
