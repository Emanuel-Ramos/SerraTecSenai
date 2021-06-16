package org.serratec.resources;

import java.util.List;

import org.serratec.models.Bairro;
import org.serratec.models.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BairroResource {

	@Autowired
	BairroRepository repository;
	
	@GetMapping("/bairro/todos")
	public ResponseEntity<?> getTodos() {
		List<Bairro> todas = repository.findAll();
		
		return new ResponseEntity<>(todas, HttpStatus.OK);
	}	
	
	@PostMapping("/bairro")
	public ResponseEntity<?> post(@RequestBody Bairro bairro) {
		repository.save(bairro);
		
		return new ResponseEntity<>("Cadastrado com sucesso", HttpStatus.OK);
	}
	
}
