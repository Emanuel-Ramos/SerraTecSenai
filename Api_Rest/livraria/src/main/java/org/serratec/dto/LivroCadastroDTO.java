package org.serratec.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.serratec.exceptions.LivroException;
import org.serratec.models.Autor;
import org.serratec.models.Categoria;
import org.serratec.models.Classificacao;
import org.serratec.models.Editora;
import org.serratec.models.Livro;
import org.serratec.repository.AutorRepository;
import org.serratec.repository.ClassificacaoRepository;
import org.serratec.repository.EditoraRepository;
import org.serratec.repository.LeitorRepository;
import org.serratec.repository.LivroRepository;

public class LivroCadastroDTO {

	@NotNull
	@NotBlank
	private String codigo;
	
	@NotNull
	@NotBlank
	private String nome;
	
	private LocalDate dataLancamento;
	
	@NotNull
	private Double valor;
	
	private Optional<Categoria> categoria = Optional.empty();
	
	@NotNull
	private Integer numeroPaginas;
	private List<String> autores;
	private List<String> classificacoes;
	private String editora;
	
	public Livro toLivro(AutorRepository autorRepository, EditoraRepository editoraRepository, ClassificacaoRepository classificacaoRepository) {
		
		Livro livro = new Livro();
		livro.setCodigo(this.codigo);
		livro.setNome(this.nome);
		livro.setDataLancamento(this.dataLancamento);
		livro.setValor(this.valor);
		livro.setCategoria(this.categoria.orElse(Categoria.OUTROS));
		livro.setNumeroPaginas(this.numeroPaginas);
		
		for (String codigo : autores) {
			Optional<Autor> autor = autorRepository.findByCodigo(codigo);
			
			if (autor.isEmpty())
				throw new LivroException("Autor \"" + codigo + "\" não encontrado");
			
			livro.getAutores().add(autor.get());
		}
		
		for (String codigo : classificacoes) {
			Optional<Classificacao> classificacao = classificacaoRepository.findByCodigo(codigo);
			
			if (classificacao.isEmpty())
				throw new LivroException("Livro \"" + codigo + "\" não encontrado");
			
			livro.getClassificacoes().add(classificacao.get());
		}
		
		Optional<Editora> editora = editoraRepository.findByCodigo(this.editora);
		
		if (editora.isEmpty())
			throw new LivroException("Editora \"" + this.editora + "\" não econtrada");
		
		livro.setEditora(editora.get());
		
		return livro;
	}

	public List<String> getClassificacoes() {
		return classificacoes;
	}

	public void setClassificacoes(List<String> classificacoes) {
		this.classificacoes = classificacoes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Optional<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(Optional<Categoria> categoria) {
		this.categoria = categoria;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
