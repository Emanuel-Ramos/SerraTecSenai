package org.serratec.dto;

import java.util.ArrayList;
import java.util.List;

import org.serratec.models.Bairro;
import org.serratec.models.Cidade;

public class CidadeCompletoDTO {

	private String nome;
	private List<String> bairros;
	
	public CidadeCompletoDTO(Cidade cidade) {
		this.nome = cidade.getNome();
		this.bairros = new ArrayList<>();
		
		for (Bairro bairro : cidade.getBairros()) {
			this.bairros.add(bairro.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getBairros() {
		return bairros;
	}

	public void setBairros(List<String> bairros) {
		this.bairros = bairros;
	}	
}
