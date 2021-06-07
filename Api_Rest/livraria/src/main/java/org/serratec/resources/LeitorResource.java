package org.serratec.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.serratec.dto.LeitorCadastroDTO;
import org.serratec.dto.LeitorCompletoDTO;
import org.serratec.dto.LeitorSimplificadoDTO;
import org.serratec.models.Leitor;
import org.serratec.repository.LeitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeitorResource {
	
	@Autowired
	LeitorRepository repository;

	@GetMapping("/leitor/todos")
	public ResponseEntity<?> getTodos() {
		List<Leitor> todos = repository.findAll();
		List<LeitorSimplificadoDTO> dtos = new ArrayList<>();
		
		for (Leitor leitor : todos) 
			dtos.add(new LeitorSimplificadoDTO(leitor));
		
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/leitor/detalhe/{id}")
	public ResponseEntity<?> getDetalhe(@PathVariable Long id) {
		Optional<Leitor> optional = repository.findById(id);
		
		if (optional.isEmpty())
			return new ResponseEntity<>("Não encontrado", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(new LeitorCompletoDTO(optional.get()), HttpStatus.OK);
	}
	
	@PostMapping("/leitor")
	public ResponseEntity<?> post(@Validated @RequestBody LeitorCadastroDTO dto) {
		
		Leitor leitor = dto.toLeitor();
		
		try {
			repository.save(leitor);
			
			return new ResponseEntity<>("Cadastrado com sucesso", HttpStatus.OK);
		} catch (DataIntegrityViolationException e) {
			
			if (repository.existsByEmail(leitor.getEmail()))
				return new ResponseEntity<>("Já existe um usuario com este e-mail", HttpStatus.BAD_REQUEST);
				
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
