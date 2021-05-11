package Classes;

public class Pet {
    private String nome;

    public Pet(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pet nome " + nome;
   }
    
}