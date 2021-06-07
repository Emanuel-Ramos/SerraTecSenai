package org.serratec.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.serratec.models.Categoria;
import org.serratec.models.Endereco;
import org.serratec.models.Genero;
import org.serratec.models.Leitor;

public class LeitorCadastroDTO {

	@NotNull
	@NotBlank	
	private String nome;
	
	@NotNull
	private LocalDate dataNascimento;
	
	@NotNull
	@NotBlank
	private String email;
	
	private List<Categoria> categoriasFavoritas = new ArrayList<>();
	
	@NotNull
	private Genero genero;
	
	private Optional<Endereco> endereco = Optional.empty();
	
	public Leitor toLeitor() {
		Leitor leitor = new Leitor();
		leitor.setNome(this.nome);
		leitor.setDataNascimento(this.dataNascimento);
		leitor.setEmail(this.email.toLowerCase());
		leitor.setCategoriasFavoritas(this.categoriasFavoritas);
		leitor.setGenero(this.genero);
		
		if (!this.endereco.isEmpty())
			leitor.setEndereco(this.endereco.get());
		
		return leitor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Categoria> getCategoriasFavoritas() {
		return categoriasFavoritas;
	}

	public void setCategoriasFavoritas(List<Categoria> categoriasFavoritas) {
		this.categoriasFavoritas = categoriasFavoritas;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Optional<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(Optional<Endereco> endereco) {
		this.endereco = endereco;
	}
}
