package org.serratec.dto;

import java.util.Optional;

import org.serratec.models.Bairro;
import org.serratec.models.Cep;
import org.serratec.models.repository.BairroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CepCadastroDTO {

	private String numero;
	private String logradouro;
	private String bairro;

	public Cep toCep(BairroRepository bairroRepository) {
		
		Optional<Bairro> bairro = bairroRepository.findByNome(this.getBairro());
		
		if (bairro.isEmpty())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O bairro não foi encontrado");
		
		Cep cep = new Cep();
		cep.setNumero(this.getNumero());
		cep.setLogradouro(this.getLogradouro());
		cep.setBairro(bairro.get());		
		
		return cep;
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
	
}
