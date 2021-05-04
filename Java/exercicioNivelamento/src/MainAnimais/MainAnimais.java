package MainAnimais;

import java.time.LocalDate;
import Animais.Cachorro;
import Animais.Cavalo;
import Animais.Tucano;

public class MainAnimais {

	public static void main(String[] args) {
   
		
		Tucano tucano01 = new Tucano("Gustavo", LocalDate.parse("2021-12-01"), "Azul", 70);
		System.out.println(tucano01);
		System.out.println(tucano01.voar());
		System.out.println(tucano01.emitirSom());
		
		Cachorro cachorro01 = new Cachorro("Lulu", LocalDate.parse("2021-12-01"), "Vira lata", false);
		System.out.println(cachorro01);
		System.out.println(cachorro01.amamentar());
		System.out.println(cachorro01.emitirSom());
		Cavalo cavalo01 = new Cavalo("Guilherme", LocalDate.parse("2021-12-01"), "Brabao", "Tramontina");
		System.out.println(cavalo01);
		
		
		
		
		
		
		
		
		
		
	}

}
