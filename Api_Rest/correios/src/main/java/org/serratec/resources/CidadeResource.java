package org.serratec.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.serratec.dto.CidadeCompletoDTO;
import org.serratec.dto.CidadeSimplificadoDTO;
import org.serratec.models.Cidade;
import org.serratec.models.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CidadeResource {

	@Autowired
	CidadeRepository repository;
	
	@GetMapping("/cidade/todos/simplificado")
	public ResponseEntity<?> getTodosSimplificado() {
		List<Cidade> todas = repository.findAll();
		List<CidadeSimplificadoDTO> dtos = new ArrayList<>();
		
		for (Cidade cidade : todas) {
			dtos.add(new CidadeSimplificadoDTO(cidade));
		}
		
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/cidade/todos/completo")
	public ResponseEntity<?> getTodosCompleto() {
		List<Cidade> todas = repository.findAll();
		List<CidadeCompletoDTO> dtos = new ArrayList<>();
		
		for (Cidade cidade : todas) {
			dtos.add(new CidadeCompletoDTO(cidade));
		}
		
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/cidade/simplificado/{id}")
	public ResponseEntity<?> getSimplificado(@PathVariable Long id) {
		Optional<Cidade> cidade = repository.findById(id);
		
		if (cidade.isEmpty())
			return new ResponseEntity<>("Cidade não econtrada", HttpStatus.NOT_FOUND);
	
		CidadeSimplificadoDTO dto = new CidadeSimplificadoDTO(cidade.get());
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@GetMapping("/cidade/completo/{id}")
	public ResponseEntity<?> getCompleto(@PathVariable Long id) {
		Optional<Cidade> cidade = repository.findById(id);
		
		if (cidade.isEmpty())
			return new ResponseEntity<>("Cidade não econtrada", HttpStatus.NOT_FOUND);
	
		CidadeCompletoDTO dto = new CidadeCompletoDTO(cidade.get());
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@PostMapping("/cidade")
	public ResponseEntity<?> post(@RequestBody Cidade cidade) {
		repository.save(cidade);
		
		return new ResponseEntity<>("Cadastrado com sucesso", HttpStatus.OK);
	}
	
}
