package org.serratec.dto;

import org.serratec.models.Leitor;

public class LeitorSimplificadoDTO {

	private String nome;
	private String email;
	
	public LeitorSimplificadoDTO(Leitor leitor) {
		this.nome = leitor.getNome();
		this.email = leitor.getEmail();
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
