package org.serratec.resources;

import java.util.Optional;

import org.serratec.dto.CepCadastroDTO;
import org.serratec.dto.CepCompletoDTO;
import org.serratec.dto.CepSimplificadoDTO;
import org.serratec.models.Cep;
import org.serratec.models.repository.BairroRepository;
import org.serratec.models.repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CepResource {

	@Autowired
	CepRepository repository;
	
	@Autowired
	BairroRepository bairroRepository;
	
	@GetMapping("/cep/todos")
	public ResponseEntity<?> getTodos() {
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/cep/simplificado/{numero}")
	public ResponseEntity<?> getSimplificado(@PathVariable String numero) {
		
		Optional<Cep> cep = repository.findByNumero(numero);
		
		if (cep.isEmpty())
			return new ResponseEntity<>("Não existe um CEP com este número", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(new CepSimplificadoDTO(cep.get()), HttpStatus.OK);
	}
	
	@GetMapping("/cep/completo/{numero}")
	public ResponseEntity<?> getCompleto(@PathVariable String numero) {
		
		Optional<Cep> cep = repository.findByNumero(numero);
		
		if (cep.isEmpty())
			return new ResponseEntity<>("Não existe um CEP com este número", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(new CepCompletoDTO(cep.get()), HttpStatus.OK);
	}
	
	@PostMapping("/cep")
	public ResponseEntity<?> postCep(@Validated @RequestBody CepCadastroDTO dto) {
		
		try {
			Cep cep = dto.toCep(bairroRepository);
			
			repository.save(cep);
			
			return new ResponseEntity<>("Cep cadastrado com sucesso", HttpStatus.OK);
			
		} catch (ResponseStatusException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}		
		
	}
	
}
