package MainAtleta;

import exercicioAtleta.Atletas;
import exercicioAtleta.Time;

public class MainAtleta {
	public static void main(String[] args) {
		Atletas atleta01 = new Atletas("Brtt", 19, "Futebol");
		Time time01 = new Time("Pain", "Kami", atleta01);
		
		System.out.println(time01);
	}
}
