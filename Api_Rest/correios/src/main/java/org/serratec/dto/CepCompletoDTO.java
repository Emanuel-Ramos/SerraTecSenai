package org.serratec.dto;

import org.serratec.models.Bairro;
import org.serratec.models.Cep;
import org.serratec.models.Cidade;

public class CepCompletoDTO {
	
	public String numero;
	public String logradouro;
	public String bairro;
	public String cidade;

	public CepCompletoDTO(Cep cep) {
		this.numero = cep.getNumero();
		this.logradouro = cep.getLogradouro();
		
		Bairro bairro = cep.getBairro();
		
		if (bairro != null) {
			this.bairro = bairro.getNome();
			
			Cidade cidade = bairro.getCidade();
			
			if (cidade != null) {
				this.cidade = cidade.getNome();
			}
		}	
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
