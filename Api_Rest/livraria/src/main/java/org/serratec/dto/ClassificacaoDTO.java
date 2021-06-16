package org.serratec.dto;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.serratec.models.Classificacao;

import org.serratec.models.Leitor;
import org.serratec.models.Livro;
import org.serratec.repository.LeitorRepository;
import org.serratec.repository.LivroRepository;


public class ClassificacaoDTO {
	@NotNull
	@NotBlank
	private String leitor;
	
	@NotNull
	@NotBlank
	private String livro;

	private String codigo;

	private Double nota;
	
	private String comentario;
	
	private String recomenda;

	private LocalDateTime quando;



	public Classificacao toClassificacao (LeitorRepository leitorRepository, LivroRepository livroRepository) {
		
		Classificacao classificacao = new Classificacao();
		Optional<Leitor> leitor = leitorRepository.findByEmail(this.leitor);
		classificacao.setLeitor(leitor.get());
		
		Optional<Livro> livro = livroRepository.findByCodigo(this.livro);
		classificacao.setLivro(livro.get());
		
		classificacao.setCodigo(livro.get().getCodigo());
		
		classificacao.setNota(this.nota);
		classificacao.setComentario(this.comentario);
		classificacao.setRecomenda(this.recomenda);
		classificacao.setDataHora(this.quando);
		
		
		
		return classificacao;
	}


	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getLeitor() {
		return leitor;
	}

	public void setLeitor(String leitor) {
		this.leitor = leitor;
	}


	public String getLivro() {
		return livro;
	}







	public void setLivro(String livro) {
		this.livro = livro;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public String getRecomenda() {
		return recomenda;
	}


	public void setRecomenda(String recomenda) {
		this.recomenda = recomenda;
	}


	public LocalDateTime getQuando() {
		return quando;
	}


	public void setQuando(LocalDateTime quando) {
		this.quando = quando;
	}
	
}
