package tquestao7;

public class Homem extends Primata {
	protected void ver() {
		System.out.println("Homem vendo");
	}
	public static void main(String args[]) {
		Mamifero m = new Homem();
		m.andar();
	}
}
