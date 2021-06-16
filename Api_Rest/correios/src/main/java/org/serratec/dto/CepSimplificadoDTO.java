package org.serratec.dto;

import org.serratec.models.Cep;

public class CepSimplificadoDTO {
	
	public String numero;
	public String logradouro;
	
	public CepSimplificadoDTO(Cep cep) {
		this.numero = cep.getNumero();
		this.logradouro = cep.getLogradouro();
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
