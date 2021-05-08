package Dono;


import Pets.Pet;


public class Dono {
	private String nome;
	private String cpf;
	private Pet pet;
		
	public Dono(String nome, String cpfDono) {
		super();
		this.nome = nome;
		this.cpf = cpfDono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public void petDono(Pet novoPet) {
		this.setPet(pet);
	}
	
}
