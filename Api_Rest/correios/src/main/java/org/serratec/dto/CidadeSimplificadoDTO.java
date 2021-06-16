package org.serratec.dto;

import org.serratec.models.Cidade;

public class CidadeSimplificadoDTO {

	private String nome;	
	
	public CidadeSimplificadoDTO(Cidade cidade) {
		this.nome = cidade.getNome();		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}		
}
