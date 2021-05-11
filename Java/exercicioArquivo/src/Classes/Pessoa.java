package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private LocalDate dataNascimento;
    public List<Pet> pets;


    public Pessoa(String nome, int idade, LocalDate dataNascimento) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.pets = new ArrayList<>();
    }

    public List<Pet> getPets() {
        return pets;
    }

    public Pessoa(List<Pet> pets) {
        super();
        this.pets = pets;
    }    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Data de Nascimento: " + dataNascimento + "Pet: " + pets;
    }




}